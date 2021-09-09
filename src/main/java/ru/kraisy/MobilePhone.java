package ru.kraisy;

public class MobilePhone
{
    private final String phone;
    private final String color;
    private final int price;
    private double phoneVersion;
    private final int capacity;
    private int password;
    boolean isPhoneLocked;
    boolean isPhonePowered;

    public MobilePhone(String phone, String color, int capacity, int price)
    {
        this.phone = phone;
        this.color = color;
        this.capacity = capacity;
        this.price = price;
    }

    public void powerOn()
    {
        isPhonePowered = true;
        System.out.println(phone + " was turned on successfully");
    }

    public void powerOff()
    {
        System.out.println(phone + " shutting down...");
        isPhonePowered = false;
    }

    public void setPassword(int password)
    {
        this.password = password;
        System.out.println("Password " + password + " was installed");
    }

    public void lock()
    {
        isPhoneLocked = true;
        System.out.println(phone + " has locked");
    }

    public void unlock(int password)
    {
        if (password == this.password)
        {
            isPhoneLocked = false;
            System.out.println(phone + " was unlocked successfully");
        }
        else
        {
            System.out.println("The password is wrong");
        }
    }

    public String getColor()
    {
        return color;
    }

    public int getCapacity()
    {
        return capacity;
    }

    public String getPhone()
    {
        return phone;
    }

    public double getPhoneVersion()
    {
        return phoneVersion;
    }

    public void setPhoneVersion(double phoneVersion)
    {
        this.phoneVersion = phoneVersion;
        System.out.println("Version " + phoneVersion + " was installed on " + phone);
    }

    public String getChip()
    {
        return "A13";
    }

    public int getPrice()
    {
        return price;
    }
}
