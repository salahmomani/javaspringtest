package com.salah.springRest.controller;

import com.salah.springRest.model.VendorCloud;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/apivendor")
public class VendorController {
    VendorCloud vendorCloud;

    @PostMapping
    public String createCloud(@RequestBody VendorCloud vendorCloud) {
        this.vendorCloud = vendorCloud;
        return "Cloud vendor created";
    }

    @GetMapping("{ID}")
    public VendorCloud getCloudDetails(@PathVariable("ID") String vendorId) {
        return this.vendorCloud;
    }

    @PutMapping
    public String updateCloud(@RequestBody VendorCloud cloudVendor) {
        this.vendorCloud = cloudVendor;
        return "Cloud vendor updated";
    }

    @DeleteMapping("{ID}")
    public String deleteCloud(@PathVariable("ID") String vendorId) {
        this.vendorCloud = null;
        return "Cloud vendor deleted";
    }
}
