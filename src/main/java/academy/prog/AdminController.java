package academy.prog;

import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/admin")
public class AdminController {
    private final UrlService urlService;

    public AdminController(UrlService urlService) {
        this.urlService = urlService;
    }

    @GetMapping("stat")
    public List<UrlStatDTO> stat(
            @RequestParam(required = false, defaultValue = "0") int page) {
        return urlService.getStatistics();
    }


}

