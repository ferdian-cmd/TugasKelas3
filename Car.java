/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Abstrak;

/**
 *
 * @author ferdian
 */
// Nama: Ferdian Wahyu Nabillah
// NIM: (09040623059)

//Penjelasan:
//Setiap kelas konkret (Car, Motorcycle, Truck) akan mewarisi dari kelas abstrak Vehicle dan mengimplementasikan interface Maintenance. 
//Ini memungkinkan setiap jenis kendaraan memiliki cara spesifik untuk menampilkan informasi dan menjadwalkan perawatan.

public class Car extends Vehicle implements Maintenance {
    int numberOfDoors;

    Car(String registrationNumber, String brand, String model, int year, int numberOfDoors) {
        super(registrationNumber, brand, model, year);
        this.numberOfDoors = numberOfDoors;
    }

    @Override
    void displayInfo() {
        System.out.println("Mobil: " + brand + " " + model + " (" + year + "), Pintu: " + numberOfDoors);
    }

    @Override
    int getNumberOfWheels() {
        return 4;
    }

    @Override
    public void scheduleMaintenance() {
        System.out.println("Menjadwalkan perawatan mobil: Penggantian oli, Rotasi ban");
    }
}

class Motorcycle extends Vehicle implements Maintenance {
    boolean hasSidecar;

    Motorcycle(String registrationNumber, String brand, String model, int year, boolean hasSidecar) {
        super(registrationNumber, brand, model, year);
        this.hasSidecar = hasSidecar;
    }

    @Override
    void displayInfo() {
        System.out.println("Sepeda Motor: " + brand + " " + model + " (" + year + "), Sidecar: " + (hasSidecar ? "Ada" : "Tidak Ada"));
    }

    @Override
    int getNumberOfWheels() {
        return hasSidecar ? 3 : 2;
    }

    @Override
    public void scheduleMaintenance() {
         System.out.println("Menjadwalkan perawatan sepeda motor: Pelumasan rantai, Pemeriksaan rem");
    }
}

class Truck extends Vehicle implements Maintenance {
    int loadCapacity;

    Truck(String registrationNumber, String brand, String model, int year, int loadCapacity) {
        super(registrationNumber, brand, model, year);
        this.loadCapacity = loadCapacity;
    }

    @Override
    void displayInfo() {
         System.out.println("Truk: " + brand + " " + model + " (" + year + "), Kapasitas Muatan: " + loadCapacity + " ton");
    }

    @Override
    int getNumberOfWheels() {
        return 6;
    }

    @Override
    public void scheduleMaintenance() {
       System.out.println("Menjadwalkan perawatan truk: Pemeriksaan mesin, Pemeriksaan rem");
    }
}
