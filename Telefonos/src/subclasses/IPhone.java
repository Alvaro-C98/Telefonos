package subclasses;

import abstracts.Phone;

import interfaces.Ringable;

public class IPhone extends Phone implements Ringable {
    public IPhone(String versionNumber, int batteryPercentage, String carrier, String ringTone) {
        super(versionNumber, batteryPercentage, carrier, ringTone);
    }
    @Override
    public String ring() {
        return "iPhone "+super.getVersionNumber()+" says "+super.getRingTone();
    }
    @Override
    public String unlock() {
        return "Unlocking via facial recognition";
    }
    @Override
    public void displayInfo() {
        System.out.println("iPhone "+super.getVersionNumber()+" from "+super.getCarrier());
    }
}


