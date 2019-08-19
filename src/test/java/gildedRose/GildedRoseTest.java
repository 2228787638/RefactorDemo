package gildedRose;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class GildedRoseTest {

    @Test
    public void should_return_Quality_0_and_SellIn_0_given_item_named_abcd_and_quality_1_and_sellln_1() {
        Item item = new Item("abcd",1,1);
        Item[] items = new Item[1];
        items[0] = item;
        GildedRose gildedRose = new GildedRose(items);
        gildedRose.updateQuality();
        Assert.assertEquals(0,gildedRose.getItems()[0].getQuality());
        Assert.assertEquals(0,gildedRose.getItems()[0].getSellIn());
    }

    @Test
    public void should_return_Quality_0_and_SellIn_negative_1_given_item_named_abcd_and_quality_1_and_sellln_0() {
        Item item = new Item("abcd",0,1);
        Item[] items = new Item[1];
        items[0] = item;
        GildedRose gildedRose = new GildedRose(items);
        gildedRose.updateQuality();
        Assert.assertEquals(0,gildedRose.getItems()[0].getQuality());
        Assert.assertEquals(-1,gildedRose.getItems()[0].getSellIn());
    }

    @Test
    public void should_return_Quality_0_and_SellIn_negative_1_given_item_named_abcd_and_quality_0_and_sellln_0() {
        Item item = new Item("abcd",0,0);
        Item[] items = new Item[1];
        items[0] = item;
        GildedRose gildedRose = new GildedRose(items);
        gildedRose.updateQuality();
        Assert.assertEquals(0,gildedRose.getItems()[0].getQuality());
        Assert.assertEquals(-1,gildedRose.getItems()[0].getSellIn());
    }

    @Test
    public void should_return_Quality_0_and_SellIn_0_given_item_named_abcd_and_quality_0_and_sellln_1() {
        Item item = new Item("abcd",1,0);
        Item[] items = new Item[1];
        items[0] = item;
        GildedRose gildedRose = new GildedRose(items);
        gildedRose.updateQuality();
        Assert.assertEquals(0,gildedRose.getItems()[0].getQuality());
        Assert.assertEquals(0,gildedRose.getItems()[0].getSellIn());
    }

    @Test
    public void should_return_Quality_0_and_SellIn_0_given_item_named_abcd_and_quality_2_and_sellln_0() {
        Item item = new Item("abcd",0,2);
        Item[] items = new Item[1];
        items[0] = item;
        GildedRose gildedRose = new GildedRose(items);
        gildedRose.updateQuality();
        Assert.assertEquals(0,gildedRose.getItems()[0].getQuality());
        Assert.assertEquals(-1,gildedRose.getItems()[0].getSellIn());
    }

    @Test
    public void should_return_Quality_2_and_SellIn_negative_1_given_item_named_Sulfuras_Hand_of_Ragnaros_and_quality_2_and_sellln_negative_1() {
        Item item = new Item("Sulfuras, Hand of Ragnaros",-1,2);
        Item[] items = new Item[1];
        items[0] = item;
        GildedRose gildedRose = new GildedRose(items);
        gildedRose.updateQuality();
        Assert.assertEquals(2,gildedRose.getItems()[0].getQuality());
        Assert.assertEquals(-1,gildedRose.getItems()[0].getSellIn());
    }

    @Test
    public void should_return_Quality_0_and_SellIn_negative_2_given_item_named_Backstage_passes_to_a_TAFKAL80ETC_concert_and_quality_2_and_sellln_negative_1() {
        Item item = new Item("Backstage passes to a TAFKAL80ETC concert",-1,2);
        Item[] items = new Item[1];
        items[0] = item;
        GildedRose gildedRose = new GildedRose(items);
        gildedRose.updateQuality();
        Assert.assertEquals(0,gildedRose.getItems()[0].getQuality());
        Assert.assertEquals(-2,gildedRose.getItems()[0].getSellIn());
    }

    @Test
    public void should_return_Quality_1_and_SellIn_negative_1_given_item_named_Aged_Brie_and_quality_3_and_sellln_negative_2() {
        Item item = new Item("Aged Brie",-1,1);
        Item[] items = new Item[1];
        items[0] = item;
        GildedRose gildedRose = new GildedRose(items);
        gildedRose.updateQuality();
        Assert.assertEquals(3,gildedRose.getItems()[0].getQuality());
        Assert.assertEquals(-2,gildedRose.getItems()[0].getSellIn());
    }

    @Test
    public void should_return_Quality_50_and_SellIn_negative_1_given_item_named_Aged_Brie_and_quality_50_and_sellln_negative_2() {
        Item item = new Item("Aged Brie",-1,50);
        Item[] items = new Item[1];
        items[0] = item;
        GildedRose gildedRose = new GildedRose(items);
        gildedRose.updateQuality();
        Assert.assertEquals(50,gildedRose.getItems()[0].getQuality());
        Assert.assertEquals(-2,gildedRose.getItems()[0].getSellIn());
    }

    @Test
    public void should_return_Quality_50_and_SellIn_10_given_item_named_Aged_Brie_and_quality_49_and_sellln_1() {
        Item item = new Item("Backstage passes to a TAFKAL80ETC concert",11,49);
        Item[] items = new Item[1];
        items[0] = item;
        GildedRose gildedRose = new GildedRose(items);
        gildedRose.updateQuality();
        Assert.assertEquals(50,gildedRose.getItems()[0].getQuality());
        Assert.assertEquals(10,gildedRose.getItems()[0].getSellIn());
    }

    @Test
    public void should_return_Quality_50_and_SellIn_9_given_item_named_Aged_Brie_and_quality_49_and_sellln_10() {
        Item item = new Item("Backstage passes to a TAFKAL80ETC concert",10,49);
        Item[] items = new Item[1];
        items[0] = item;
        GildedRose gildedRose = new GildedRose(items);
        gildedRose.updateQuality();
        Assert.assertEquals(50,gildedRose.getItems()[0].getQuality());
        Assert.assertEquals(9,gildedRose.getItems()[0].getSellIn());
    }

    @Test
    public void should_return_Quality_50_and_SellIn_9_given_item_named_Aged_Brie_and_quality_48_and_sellln_10() {
        Item item = new Item("Backstage passes to a TAFKAL80ETC concert",10,48);
        Item[] items = new Item[1];
        items[0] = item;
        GildedRose gildedRose = new GildedRose(items);
        gildedRose.updateQuality();
        Assert.assertEquals(50,gildedRose.getItems()[0].getQuality());
        Assert.assertEquals(9,gildedRose.getItems()[0].getSellIn());
    }

    @Test
    public void should_return_Quality_50_and_SellIn_4_given_item_named_Aged_Brie_and_quality_48_and_sellln_5() {
        Item item = new Item("Backstage passes to a TAFKAL80ETC concert",5,48);
        Item[] items = new Item[1];
        items[0] = item;
        GildedRose gildedRose = new GildedRose(items);
        gildedRose.updateQuality();
        Assert.assertEquals(50,gildedRose.getItems()[0].getQuality());
        Assert.assertEquals(4,gildedRose.getItems()[0].getSellIn());
    }

    @Test
    public void should_return_Quality_48_and_SellIn_4_given_item_named_Aged_Brie_and_quality_45_and_sellln_5() {
        Item item = new Item("Backstage passes to a TAFKAL80ETC concert",5,45);
        Item[] items = new Item[1];
        items[0] = item;
        GildedRose gildedRose = new GildedRose(items);
        gildedRose.updateQuality();
        Assert.assertEquals(48,gildedRose.getItems()[0].getQuality());
        Assert.assertEquals(4,gildedRose.getItems()[0].getSellIn());
    }
}