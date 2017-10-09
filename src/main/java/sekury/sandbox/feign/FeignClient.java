package sekury.sandbox.feign;

import feign.Feign;
import feign.RequestLine;

public interface FeignClient {
    @RequestLine("GET /get")
    String get();

    static FeignClient getApi() {
        return Feign.builder().target(FeignClient.class, "https://httpbin.org");
    }
}
