package ru.kraisy;

public class Main
{
    public static void main(String[] args)
    {
        MobilePhone phone = new MobilePhone("Iphone 11", "Black", 64, 599);
        phone.powerOn();
        phone.setPhoneVersion(13.04);
        phone.setPassword(1234560);
        phone.lock();
        phone.unlock(12345);
        phone.unlock(1234560);
        phone.powerOff();

        System.out.println(phone.getPhone() + " is working successfully\n");
        System.out.println("The " + phone.getPhone() + " has next specs:\n"
                + "Model: " + phone.getPhone() + "\n"
                + "OS Version: " + phone.getPhoneVersion() + "\n"
                + "Color: " + phone.getColor() + "\n"
                + "Capacity: " + phone.getCapacity() + "GB\n"
                + "Price: " + phone.getPrice() + "$\n"
                + "Chip: " + phone.getChip() + "\n");
    }
}
