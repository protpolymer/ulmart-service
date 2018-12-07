package ru.itpark;

import ru.itpark.comparator.CostAscComparator;
import ru.itpark.comparator.NameAscComparator;
import ru.itpark.domain.*;
import ru.itpark.repository.UlmartRepository;
import ru.itpark.service.UlmartService;

public class Main {
    public static void main(String[] args) {
    UlmartService ulmartService = new UlmartService(new UlmartRepository());

    ulmartService.add(new PC(1, 30_000, "ноутбуки и компьютеры", "MicroXperts", "Intel® Pentium™ G4400", 4098, 4, "Intel® HD Graphics", "no OS"));
    ulmartService.add(new PC(2, 35_270, "ноутбуки и компьютеры", "Nexport", "Intel® Celeron® G3900", 1024, 4, "Intel® HD Graphics", "no OS"));
    ulmartService.add(new Laptop(3, 13_990, "ноутбуки и компьютеры", "ASUS X540YA", "90NB0CN1-M00660", "15.6\" (1366x768)", 500, 2, "AMD E1-7010", "AMD Radeon R2", "FreeDOS", true, false, "black"));
    ulmartService.add(new Laptop(4, 105_990, "ноутбуки и компьютеры", "Apple MacBook Pro 13 Silver Mid2017", "MPXR2RU/A", "13.3\" (2560x1600) Retina", 128, 8, "Intel Core i5-7360U", "Intel Iris Plus Graphics 640", "macOS", true, true, "silver"));
    ulmartService.add(new Phone(5, 2_390, "Смартфоны и гаджеты", "GINZZU R2 DUAL", "черно-оранжевый"));
    ulmartService.add(new Phone(6, 2_390, "Смартфоны и гаджеты", "Philips Xenium E181 Black", "черный"));
    ulmartService.add(new Smartphone(7, 6_990, "Смартфоны и гаджеты", "Samsung Galaxy J1", "quad core CPU", 4, 1, true, 5, "золотой" ));
    ulmartService.add(new Smartphone(8, 6_990, "Смартфоны и гаджеты", "Samsung Galaxy S8+", "octa core CPU", 64, 4, true, 12, "мистический аметист" ));
    ulmartService.add(new Microwave(9, 3_270, "Малая бытовая техника", "Витязь 1379 МП20-700-6", 20 ));
    ulmartService.add(new Microwave(10, 3_720, "Малая бытовая техника", "Supra 20MW55", 20 ));
    ulmartService.add(new Crockpot(11, 1_990, "Малая бытовая техника", "Marta MT-4323", 5, 860, "черный жемчуг"));
    ulmartService.add(new Crockpot(12, 3_990, "Малая бытовая техника", "Polaris PMC 0558AD", 5, 700, ""));

        System.out.println(ulmartService.getSorted(new CostAscComparator()));
        System.out.println(ulmartService.getSorted(new NameAscComparator()));
        System.out.println(ulmartService.getFilterCategory("смартфоны и гаджеты").getSorted(new NameAscComparator()));
    }
}
