package gildedRose;

public class Item {

    public String name;

    public int sellIn;

    public int quality;

    public String getType(){
        if(!this.name.equals("Aged Brie")
                &&!this.name.equals("Backstage passes to a TAFKAL80ETC concert")
                &&!this.name.equals("Sulfuras, Hand of Ragnaros")){
            return "normal";
        }else{
            return this.name;
        }
    }

    public Item(String name, int sellIn, int quality) {
        this.name = name;
        this.sellIn = sellIn;
        this.quality = quality;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSellIn() {
        return sellIn;
    }

    public void setSellIn(int sellIn) {
        this.sellIn = sellIn;
    }

    public int getQuality() {
        return quality;
    }

    public void setQuality(int quality) {
        this.quality = quality;
    }

    @Override
   public String toString() {
        return this.name + ", " + this.sellIn + ", " + this.quality;
    }

    public void updateQuality() {

        switch (this.name){
            case "Aged Brie":
                new AgedBrieStrategy().update(this);
                break;
            case "Backstage passes to a TAFKAL80ETC concert":
                new BackstagePassesStrategy().update(this);
                break;
            case "Sulfuras, Hand of Ragnaros":
                break;
            default:
                new NormalStrategy().update(this);

        }



    }

    public void updateBackstagePasses(){

    }
}
