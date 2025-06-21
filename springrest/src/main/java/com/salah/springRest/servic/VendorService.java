package com.salah.springRest.servic;

import com.salah.springRest.model.VendorCloud;
import com.salah.springRest.repo.VendorRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class VendorService implements VendorServiceInterface {
    VendorServiceInterface vendorInterface;
    VendorRepo vendorRepo;

    public VendorService(VendorRepo vendorRepo) {
        this.vendorRepo = vendorRepo;
    }

    @Override
    public String createCloudVendor(VendorCloud vendorCloud) {
        //add more after final work
        vendorRepo.save(vendorCloud);
        return "Vendor created!";
    }

    @Override
    public String updateCloudVendor(VendorCloud vendorCloud) {
        //add more after final work
        vendorRepo.save(vendorCloud);
        return "Vendor  updated";
    }

    @Override
    public String deleteCloudVendor(String vendorID) {
        //add more after final work
        vendorRepo.deleteById(vendorID);
        return "deleted";
    }

    @Override
    public List<VendorCloud> geyAllCloudVendor() {
        //add more after final work
        return  vendorRepo.findAll();
    }

    @Override
    public VendorCloud getCloudVendor(String vendorID) {
        //add more after final work
        return vendorRepo.findById(vendorID).get();
    }


}
