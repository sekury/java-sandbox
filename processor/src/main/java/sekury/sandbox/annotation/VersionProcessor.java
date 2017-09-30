package sekury.sandbox.annotation;

import javax.annotation.processing.*;
import javax.lang.model.SourceVersion;
import javax.lang.model.element.TypeElement;
import javax.tools.Diagnostic;
import java.util.Set;

@SupportedAnnotationTypes({"sekury.sandbox.annotation.Version"})
@SupportedSourceVersion(SourceVersion.RELEASE_9)
public class VersionProcessor extends AbstractProcessor {
    @Override
    public boolean process(Set<? extends TypeElement> annotations, RoundEnvironment roundEnv) {
        Messager messager = this.processingEnv.getMessager();
        annotations.forEach(annotation -> {
            if (annotation.getQualifiedName().contentEquals("sekury.sandbox.annotation.Version")) {
                roundEnv.getElementsAnnotatedWith(annotation).forEach(element -> {
                    messager.printMessage(Diagnostic.Kind.NOTE, String.format("Processing version for element: %s %s",
                            element.getKind(), element));
                    Version version = element.getAnnotation(Version.class);
                    if (version.major() < 0 || version.minor() < 0) {
                        String message = String.format("Version cannot be negative: element=%s, major=%d, minor=%d.",
                                element.toString(), version.major(), version.minor());
                        messager.printMessage(Diagnostic.Kind.ERROR, message);
                    }
                });
            }
        });
        return true;
    }
}
