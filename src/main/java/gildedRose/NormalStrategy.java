package gildedRose;

public class NormalStrategy extends ItemStrategy{
    @Override
    void update(Item item) {
        if(item.getQuality() > 0) item.setQuality(item.getQuality() - 1);
        item.setSellIn(item.getSellIn()-1);
        if (item.getSellIn() < 0 && item.getQuality() > 0) {
            item.setQuality(item.getQuality()-1);
        }
    }
}
