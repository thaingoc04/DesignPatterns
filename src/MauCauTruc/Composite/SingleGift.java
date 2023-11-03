package MauCauTruc.Composite;

class SingleGift extends GiftBase{
    private String name;
    private double price;
    public SingleGift(String name, double price) {  this.name = name; this.price = price;  }
    @Override
    public double CalculateTotalPrice() { return this.price;  }
    @Override
    public String getName() {  return this.name;  }
    @Override
    public double getPrice() {
        return this.price;
    }

}