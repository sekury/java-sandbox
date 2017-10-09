package sekury.sandbox;

import sekury.sandbox.annotation.Version;
import sekury.sandbox.feign.FeignClient;

@Version(major = 1)
public class Application {
    public static void main(String[] args) {
        System.out.println(FeignClient.getApi().get());
    }
}
