package com.salah.springRest.servic;

import com.salah.springRest.model.VendorCloud;

import java.util.List;
public interface VendorServiceInterface {
    public String createCloudVendor(VendorCloud vendorCloud);

    public String updateCloudVendor(VendorCloud vendorCloud);

    public String deleteCloudVendor(String vendorID);

    public List<VendorCloud> geyAllCloudVendor();

    public VendorCloud getCloudVendor(String vendorID);
}
