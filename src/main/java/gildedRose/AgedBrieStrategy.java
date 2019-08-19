package gildedRose;

public class AgedBrieStrategy extends ItemStrategy{
    @Override
    void update(Item item) {
        if (item.getQuality() < 50) {
            item.setQuality(item.getQuality() + 1);
        }
        item.setSellIn(item.getSellIn()-1);
        if (item.getQuality() < 50) {
            item.setQuality(item.getQuality()+1);
        }
    }
}
