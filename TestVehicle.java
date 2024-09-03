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
//Kelas TestVehicle akan digunakan untuk menguji implementasi sistem manajemen kendaraan.
public class TestVehicle {
    public static void main(String[] args) {
        Vehicle car = new Car("ABC123", "Lamborghini", "sterrato", 2024, 2);
        Vehicle motorcycle = new Motorcycle("XYZ789", "Harley-Davidson", "Sportster", 2019, false);
        Vehicle truck = new Truck("LMN456", "Volvo", "FH16", 2018, 15);

        car.displayInfo();
        car.scheduleMaintenance();

        motorcycle.displayInfo();
        motorcycle.scheduleMaintenance();

        truck.displayInfo();
        truck.scheduleMaintenance();
    }
}
