
package de.neuefische.shopsystem.Controller;

import de.neuefische.shopsystem.model.Order;
import de.neuefische.shopsystem.model.Product;
import de.neuefische.shopsystem.service.ShopService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@RestController
@RequestMapping("api/shop")

public class ShopController {
    private final ShopService shopservice;

    public ShopController(ShopService shopservice) {
        this.shopservice = shopservice;
    }
@GetMapping ("/api/shop/products")
    public List<Product> getAllProducts(){
        return shopservice.listProducts();
}
@GetMapping("/api/shop/products/{id}")
    public Product getPoductById(@PathVariable String id){
    return shopservice.getProductById(id);
}

@GetMapping("api/shop/orders")
    public List<Order> getAllOrders(){
        return shopservice.listOrders();
}

    @GetMapping("/api/shop/orders/{id}")
    public Order getOrderById(@PathVariable String id){
        return shopservice.getOrderById(id);
    }

}
