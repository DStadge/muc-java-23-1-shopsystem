
package de.neuefische.shopsystem.Controller;

import de.neuefische.shopsystem.service.ShopService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("api/shop")

public class ShopController {
    private final ShopService shopservice;

    public ShopController(ShopService shopservice) {
        this.shopservice = shopservice;
    }



}
