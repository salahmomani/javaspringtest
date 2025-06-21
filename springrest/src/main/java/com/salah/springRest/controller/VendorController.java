package com.salah.springRest.controller;

import com.salah.springRest.model.VendorCloud;
import com.salah.springRest.servic.VendorService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/apivendor")
public class VendorController {
   //VendorCloud vendorCloud;

    VendorService vendorService;

    public VendorController(VendorService vendorService) {
        this.vendorService = vendorService;
    }

    @PostMapping
    public String createCloud(@RequestBody VendorCloud vendorCloud) {

        vendorService.createCloudVendor(vendorCloud);
        return "Cloud vendor created";
    }

    @GetMapping("{ID}")
    public VendorCloud getCloudDetails(@PathVariable("ID") String vendorId) {
       return vendorService.getCloudVendor(vendorId);
    }

    @GetMapping()
    public List<VendorCloud> getAllCloudDetails() {
        return vendorService.geyAllCloudVendor();
    }
    @PutMapping
    public String updateCloud(@RequestBody VendorCloud cloudVendor) {
        vendorService.updateCloudVendor(cloudVendor);
        return "Cloud vendor updated";
    }

    @DeleteMapping("{ID}")
    public String deleteCloud(@PathVariable("ID") String vendorId) {
            vendorService.deleteCloudVendor(vendorId);
        return "Cloud vendor deleted";
    }
}
