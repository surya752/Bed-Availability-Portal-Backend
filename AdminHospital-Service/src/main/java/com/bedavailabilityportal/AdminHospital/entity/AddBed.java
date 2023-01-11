package com.bedavailabilityportal.AdminHospital.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Entity
@Table(name ="AddBed")
//@Data
//@AllArgsConstructor
//@NoArgsConstructor
@Builder
public class AddBed {
     @Id
     @GeneratedValue(strategy = GenerationType.AUTO)
     @Column(name = "bedId")
     private Long bedId;
     @Column(name="hospitalName")
     @NotNull(message = "hospitalName")
     private String hName;
     @Column(name = "bedType")
     @NotNull(message = "bedType")
     private String bedType;
     @Column(name = "bedAvailability")
     private String bedAvailability;
     @Column(name = "bedPrice")
     @NotNull(message = "bedPrice")
     @Size(min = 2, message = " Name should have atleast 2 characters")
     private String bedPrice;

     public AddBed(Long bedId, String hName, String bedType, String bedAvailability, String bedPrice) {
          this.bedId = bedId;
          this.hName = hName;
          this.bedType = bedType;
          this.bedAvailability = bedAvailability;
          this.bedPrice = bedPrice;
     }

     public Long getBedId() {
          return bedId;
     }

     public void setBedId(Long bedId) {
          this.bedId = bedId;
     }

     public String gethName() {
          return hName;
     }

     public void sethName(String hName) {
          this.hName = hName;
     }

     public String getBedType() {
          return bedType;
     }

     public void setBedType(String bedType) {
          this.bedType = bedType;
     }

     public String getBedAvailability() {
          return bedAvailability;
     }

     public void setBedAvailability(String bedAvailability) {
          this.bedAvailability = bedAvailability;
     }

     public String getBedPrice() {
          return bedPrice;
     }

     public void setBedPrice(String bedPrice) {
          this.bedPrice = bedPrice;
     }

     @Override
     public String toString() {
          return "AddBed{" +
                  "bedId=" + bedId +
                  ", hName='" + hName + '\'' +
                  ", bedType='" + bedType + '\'' +
                  ", bedAvailability='" + bedAvailability + '\'' +
                  ", bedPrice='" + bedPrice + '\'' +
                  '}';
     }
}
