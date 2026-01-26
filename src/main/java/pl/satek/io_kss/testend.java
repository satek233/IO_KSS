package pl.satek.io_kss;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping("/")
    public String home() {
        return "IO_KSS działa poprawnie 🚀";
    }

    @GetMapping("/test")
    public String test() {
        return "Endpoint /test OK ✅";
    }
}
