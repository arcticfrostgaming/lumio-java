/*
+++++++++++++++++++++++++++++++++++++++++++
title     Lumio - Java - LumioTest        +
project   lumio-java                      +
file      LumioTest.java                  +
version                                   +
author    Arctic Ice Studio               +
email     development@arcticicestudio.com +
website   http://arcticicestudio.com      +
copyright Copyright (C) 2016              +
created   2016-01-25 14:26 UTC+0100       +
modified  2016-03-28 17:53 UTC+0200       +
+++++++++++++++++++++++++++++++++++++++++++

[Description]
JUnit test class for the 'com.arcticicestudio.lumio.Lumio' class of the "Lumio - Java" API.

[Copyright]
Copyright (C) 2016 Arctic Ice Studio <development@arcticicestudio.com>

[References]
Lumio
  (https://github.com/arcticicestudio/lumio)
Java 8 API Documentation
  (https://docs.oracle.com/javase/8/docs/api/)
JavaFX 2.2 API Documentation
  (https://docs.oracle.com/javafx/2/api/)
JavaFX 2.2 Oracle Project Website
  (http://docs.oracle.com/javase/8/javase-clienttechnologies.htm)
Arctic Versioning Specification
  (http://specs.arcticicestudio.com/arcver) (ArcVer)
*/

package com.arcticicestudio.lumio;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

/**
 * JUnit test class for the {@link Lumio} class of the
 * <a href="https://github.com/arcticicestudio/lumio-java">Lumio - Java</a> API.
 *
 * @author Arctic Ice Studio <development@arcticicestudio.com>
 * @see Lumio
 * @see <a href="http://junit.org/">http://junit.org/</a>
 * @see <a href="https://github.com/arcticicestudio/lumio-java">Lumio - Java</a>
 * @since 0.1.0
 */
public class LumioTest {
  @Test
  public void shouldReturnTheCorrectHEXColorCodeForPaletteOne() {
    assertEquals(Lumio.hex(Lumio.DARK_LIVID_WOOD.get()), "#241C1C");
    assertEquals(Lumio.hex(Lumio.LIVID_BROWN.get()), "#322726");
    assertEquals(Lumio.hex(Lumio.COWBOY.get()), "#443533");
    assertEquals(Lumio.hex(Lumio.KABUL.get()), "#6A5A4E");
    assertEquals(Lumio.hex(Lumio.PINE_CONE.get()), "#796A58");
  }

  @Test
  public void shouldReturnTheCorrectHEXColorCodeForPaletteTwo() {
    assertEquals(Lumio.hex(Lumio.MOROCCO_BROWN.get()), "#462D24");
    assertEquals(Lumio.hex(Lumio.DARK_OAK.get()), "#52352A");
    assertEquals(Lumio.hex(Lumio.CIOCCOLATO.get()), "#5D392A");
    assertEquals(Lumio.hex(Lumio.OLD_COPPER.get()), "#68402F");
    assertEquals(Lumio.hex(Lumio.BULL_SHOT.get()), "#7A4830");
    assertEquals(Lumio.hex(Lumio.KORMA.get()), "#885735");
    assertEquals(Lumio.hex(Lumio.NATURAL.get()), "#976538");
    assertEquals(Lumio.hex(Lumio.RUSTY_NAIL.get()), "#A3743B");
    assertEquals(Lumio.hex(Lumio.TUSSOCK.get()), "#AF873E");
  }
  @Test
  public void shouldReturnTheCorrectHEXColorCodeForPaletteThree() {
    assertEquals(Lumio.hex(Lumio.PHARLAP.get()), "#7E625E");
    assertEquals(Lumio.hex(Lumio.DARK_HEMP.get()), "#8C7168");
    assertEquals(Lumio.hex(Lumio.HEMP.get()), "#9D8275");
    assertEquals(Lumio.hex(Lumio.SANDRIFT.get()), "#A9917E");
  }

  @Test
  public void shouldReturnTheCorrectHEXColorCodeForPaletteFour() {
    assertEquals(Lumio.hex(Lumio.OLIVE_HAZE.get()), "#817B60");
    assertEquals(Lumio.hex(Lumio.GURKHA.get()), "#958E6F");
    assertEquals(Lumio.hex(Lumio.HILLARY.get()), "#A9A37E");
    assertEquals(Lumio.hex(Lumio.WHITE_ROCK.get()), "#CCC9AA");
  }

  @Test
  public void shouldReturnTheCorrectHEXColorCodeForPaletteFive() {
    assertEquals(Lumio.hex(Lumio.OYSTER_PINK.get()), "#CCAFAA");
    assertEquals(Lumio.hex(Lumio.WAFER.get()), "#D8C0B6");
    assertEquals(Lumio.hex(Lumio.BIZZARE.get()), "#E3D0C4");
    assertEquals(Lumio.hex(Lumio.QUARTER_SPANISH_WHITE.get()), "#E9DBCC");
  }

  @Test
  public void shouldReturnTheCorrectHEXColorCodeForPaletteSix() {
    assertEquals(Lumio.hex(Lumio.DARK_LOCHMARA.get()), "#04598F");
    assertEquals(Lumio.hex(Lumio.LOCHMARA.get()), "#046397");
    assertEquals(Lumio.hex(Lumio.CURIOUS_BLUE.get()), "#046CA5");
    assertEquals(Lumio.hex(Lumio.BOSTON_BLUE.get()), "#0480A4");
    assertEquals(Lumio.hex(Lumio.VIKING.get()), "#1398A9");
    assertEquals(Lumio.hex(Lumio.JAVA.get()), "#26A4AD");
    assertEquals(Lumio.hex(Lumio.SEA_GREEN.get()), "#36B4B0");
    assertEquals(Lumio.hex(Lumio.LIGHT_SEA_GREEN.get()), "#4DC4B1");
    assertEquals(Lumio.hex(Lumio.AQUAMARINE.get()), "#54DEB2");
  }

  @Test
  public void shouldReturnTheCorrectHEXColorCodeForPaletteSeven() {
    assertEquals(Lumio.hex(Lumio.BAROSSA.get()), "#553A47");
    assertEquals(Lumio.hex(Lumio.BLACK_ROSE.get()), "#784452");
    assertEquals(Lumio.hex(Lumio.MERLOT.get()), "#904851");
    assertEquals(Lumio.hex(Lumio.ROOF_TERRACOTTA.get()), "#A84E4E");
    assertEquals(Lumio.hex(Lumio.FLAME_PEA.get()), "#C1604D");
    assertEquals(Lumio.hex(Lumio.JAPONICA.get()), "#D47055");
  }

  @Test
  public void shouldReturnTheCorrectHEXColorCodeForPaletteEight() {
    assertEquals(Lumio.hex(Lumio.WINE_BERRY.get()), "#59313B");
    assertEquals(Lumio.hex(Lumio.SANGUINE_BROWN.get()), "#6F393A");
    assertEquals(Lumio.hex(Lumio.NUTMEG.get()), "#80483D");
    assertEquals(Lumio.hex(Lumio.PAARL.get()), "#93573F");
    assertEquals(Lumio.hex(Lumio.RED_BEECH.get()), "#A36A41");
    assertEquals(Lumio.hex(Lumio.DIRTY_TWINE.get()), "#B28142");
  }

  @Test
  public void shouldReturnTheCorrectHEXColorCodeForPaletteNine() {
    assertEquals(Lumio.hex(Lumio.LUSTY.get()), "#843C35");
    assertEquals(Lumio.hex(Lumio.MOJO.get()), "#9C4C3D");
    assertEquals(Lumio.hex(Lumio.TUSCANY.get()), "#AD6143");
    assertEquals(Lumio.hex(Lumio.BOURBON.get()), "#BA7845");
    assertEquals(Lumio.hex(Lumio.ANZAC.get()), "#C99147");
  }

  @Test
  public void shouldReturnTheCorrectHEXColorCodeForPaletteTen() {
    assertEquals(Lumio.hex(Lumio.ROPE.get()), "#A26846");
    assertEquals(Lumio.hex(Lumio.WHISKEY.get()), "#B67D4F");
    assertEquals(Lumio.hex(Lumio.DARK_TWINE.get()), "#BF8953");
    assertEquals(Lumio.hex(Lumio.TWINE.get()), "#C59759");
    assertEquals(Lumio.hex(Lumio.APACHE.get()), "#CBA65B");
  }

  @Test
  public void shouldReturnTheCorrectHEXColorCodeForPaletteEleven() {
    assertEquals(Lumio.hex(Lumio.DARK_ROPE.get()), "#945F3C");
    assertEquals(Lumio.hex(Lumio.RUSTY_TWINE.get()), "#B28142");
    assertEquals(Lumio.hex(Lumio.HOKEY_POKEY.get()), "#CDA544");
    assertEquals(Lumio.hex(Lumio.PORTICA.get()), "#ECCF49");
  }

  @Test
  public void shouldReturnTheCorrectHEXColorCodeForPaletteTwelve() {
    assertEquals(Lumio.hex(Lumio.ALERT_TAN.get()), "#8D492B");
    assertEquals(Lumio.hex(Lumio.PIPER.get()), "#9C522F");
    assertEquals(Lumio.hex(Lumio.RICH_GOLD.get()), "#AD5E33");
    assertEquals(Lumio.hex(Lumio.BAMBOO.get()), "#BF6B3E");
    assertEquals(Lumio.hex(Lumio.ZEST.get()), "#CF7B43");
  }

  @Test
  public void shouldReturnTheCorrectHEXColorCodeForPaletteThirteen() {
    assertEquals(Lumio.hex(Lumio.VERDUN_GREEN.get()), "#505B1E");
    assertEquals(Lumio.hex(Lumio.RAIN_FOREST.get()), "#626B20");
    assertEquals(Lumio.hex(Lumio.DARK_TRENDY_GREEN.get()), "#777922");
    assertEquals(Lumio.hex(Lumio.TRENDY_GREEN.get()), "#898B23");
    assertEquals(Lumio.hex(Lumio.CITRON.get()), "#9D9F28");
  }

  @Test
  public void shouldReturnTheCorrectHEXColorCodeForPaletteFourteen() {
    assertEquals(Lumio.hex(Lumio.BLUE_STONE.get()), "#1F6C6B");
    assertEquals(Lumio.hex(Lumio.DEEP_SEA.get()), "#20806A");
    assertEquals(Lumio.hex(Lumio.AMAZON.get()), "#469870");
    assertEquals(Lumio.hex(Lumio.DE_YORK.get()), "#75B47A");
    assertEquals(Lumio.hex(Lumio.GOSSIP.get()), "#8CC47B");
  }

  @Test
  public void shouldReturnTheCorrectHEXColorCodeForPaletteFifteen() {
    assertEquals(Lumio.hex(Lumio.MARTINIQUE.get()), "#483F50");
    assertEquals(Lumio.hex(Lumio.TRENDY_PINK.get()), "#664D6E");
    assertEquals(Lumio.hex(Lumio.AFFAIR.get()), "#7F5583");
    assertEquals(Lumio.hex(Lumio.EMINENCE.get()), "#975E95");
    assertEquals(Lumio.hex(Lumio.PLUM.get()), "#AB629C");
  }


  @Test
  public void shouldReturnTheCorrectRGBColorCodeForPaletteOne() {
    assertEquals(Lumio.rgb(Lumio.DARK_LIVID_WOOD.get()), "rgb(36, 28, 28)");
    assertEquals(Lumio.rgb(Lumio.LIVID_BROWN.get()), "rgb(50, 39, 38)");
    assertEquals(Lumio.rgb(Lumio.COWBOY.get()), "rgb(68, 53, 51)");
    assertEquals(Lumio.rgb(Lumio.KABUL.get()), "rgb(106, 90, 78)");
    assertEquals(Lumio.rgb(Lumio.PINE_CONE.get()), "rgb(121, 106, 88)");
  }

  @Test
  public void shouldReturnTheCorrectRGBColorCodeForPaletteTwo() {
    assertEquals(Lumio.rgb(Lumio.MOROCCO_BROWN.get()), "rgb(70, 45, 36)");
    assertEquals(Lumio.rgb(Lumio.DARK_OAK.get()), "rgb(82, 53, 42)");
    assertEquals(Lumio.rgb(Lumio.CIOCCOLATO.get()), "rgb(93, 57, 42)");
    assertEquals(Lumio.rgb(Lumio.OLD_COPPER.get()), "rgb(104, 64, 47)");
    assertEquals(Lumio.rgb(Lumio.BULL_SHOT.get()), "rgb(122, 72, 48)");
    assertEquals(Lumio.rgb(Lumio.KORMA.get()), "rgb(136, 87, 53)");
    assertEquals(Lumio.rgb(Lumio.NATURAL.get()), "rgb(151, 101, 56)");
    assertEquals(Lumio.rgb(Lumio.RUSTY_NAIL.get()), "rgb(163, 116, 59)");
    assertEquals(Lumio.rgb(Lumio.TUSSOCK.get()), "rgb(175, 135, 62)");
  }

  @Test
  public void shouldReturnTheCorrectRGBColorCodeForPaletteThree() {
    assertEquals(Lumio.rgb(Lumio.PHARLAP.get()), "rgb(126, 98, 94)");
    assertEquals(Lumio.rgb(Lumio.DARK_HEMP.get()), "rgb(140, 113, 104)");
    assertEquals(Lumio.rgb(Lumio.HEMP.get()), "rgb(157, 130, 117)");
    assertEquals(Lumio.rgb(Lumio.SANDRIFT.get()), "rgb(169, 145, 126)");
  }

  @Test
  public void shouldReturnTheCorrectRGBColorCodeForPaletteFour() {
    assertEquals(Lumio.rgb(Lumio.OLIVE_HAZE.get()), "rgb(129, 123, 96)");
    assertEquals(Lumio.rgb(Lumio.GURKHA.get()), "rgb(149, 142, 111)");
    assertEquals(Lumio.rgb(Lumio.HILLARY.get()), "rgb(169, 163, 126)");
    assertEquals(Lumio.rgb(Lumio.WHITE_ROCK.get()), "rgb(204, 201, 170)");
  }

  @Test
  public void shouldReturnTheCorrectRGBColorCodeForPaletteFive() {
    assertEquals(Lumio.rgb(Lumio.OYSTER_PINK.get()), "rgb(204, 175, 170)");
    assertEquals(Lumio.rgb(Lumio.WAFER.get()), "rgb(216, 192, 182)");
    assertEquals(Lumio.rgb(Lumio.BIZZARE.get()), "rgb(227, 208, 196)");
    assertEquals(Lumio.rgb(Lumio.QUARTER_SPANISH_WHITE.get()), "rgb(233, 219, 204)");
  }

  @Test
  public void shouldReturnTheCorrectRGBColorCodeForPaletteSix() {
    assertEquals(Lumio.rgb(Lumio.DARK_LOCHMARA.get()), "rgb(4, 89, 143)");
    assertEquals(Lumio.rgb(Lumio.LOCHMARA.get()), "rgb(4, 99, 151)");
    assertEquals(Lumio.rgb(Lumio.CURIOUS_BLUE.get()), "rgb(4, 108, 165)");
    assertEquals(Lumio.rgb(Lumio.BOSTON_BLUE.get()), "rgb(4, 128, 164)");
    assertEquals(Lumio.rgb(Lumio.VIKING.get()), "rgb(19, 152, 169)");
    assertEquals(Lumio.rgb(Lumio.JAVA.get()), "rgb(38, 164, 173)");
    assertEquals(Lumio.rgb(Lumio.SEA_GREEN.get()), "rgb(54, 180, 176)");
    assertEquals(Lumio.rgb(Lumio.LIGHT_SEA_GREEN.get()), "rgb(77, 196, 177)");
    assertEquals(Lumio.rgb(Lumio.AQUAMARINE.get()), "rgb(84, 222, 178)");
  }

  @Test
  public void shouldReturnTheCorrectRGBColorCodeForPaletteSeven() {
    assertEquals(Lumio.rgb(Lumio.BAROSSA.get()), "rgb(85, 58, 71)");
    assertEquals(Lumio.rgb(Lumio.BLACK_ROSE.get()), "rgb(120, 68, 82)");
    assertEquals(Lumio.rgb(Lumio.MERLOT.get()), "rgb(144, 72, 81)");
    assertEquals(Lumio.rgb(Lumio.ROOF_TERRACOTTA.get()), "rgb(168, 78, 78)");
    assertEquals(Lumio.rgb(Lumio.FLAME_PEA.get()), "rgb(193, 96, 77)");
    assertEquals(Lumio.rgb(Lumio.JAPONICA.get()), "rgb(212, 112, 85)");
  }

  @Test
  public void shouldReturnTheCorrectRGBColorCodeForPaletteEight() {
    assertEquals(Lumio.rgb(Lumio.WINE_BERRY.get()), "rgb(89, 49, 59)");
    assertEquals(Lumio.rgb(Lumio.SANGUINE_BROWN.get()), "rgb(111, 57, 58)");
    assertEquals(Lumio.rgb(Lumio.NUTMEG.get()), "rgb(128, 72, 61)");
    assertEquals(Lumio.rgb(Lumio.PAARL.get()), "rgb(147, 87, 63)");
    assertEquals(Lumio.rgb(Lumio.RED_BEECH.get()), "rgb(163, 106, 65)");
    assertEquals(Lumio.rgb(Lumio.DIRTY_TWINE.get()), "rgb(178, 129, 66)");
  }

  @Test
  public void shouldReturnTheCorrectRGBColorCodeForPaletteNine() {
    assertEquals(Lumio.rgb(Lumio.LUSTY.get()), "rgb(132, 60, 53)");
    assertEquals(Lumio.rgb(Lumio.MOJO.get()), "rgb(156, 76, 61)");
    assertEquals(Lumio.rgb(Lumio.TUSCANY.get()), "rgb(173, 97, 67)");
    assertEquals(Lumio.rgb(Lumio.BOURBON.get()), "rgb(186, 120, 69)");
    assertEquals(Lumio.rgb(Lumio.ANZAC.get()), "rgb(201, 145, 71)");
  }

  @Test
  public void shouldReturnTheCorrectRGBColorCodeForPaletteTen() {
    assertEquals(Lumio.rgb(Lumio.ROPE.get()), "rgb(162, 104, 70)");
    assertEquals(Lumio.rgb(Lumio.WHISKEY.get()), "rgb(182, 125, 79)");
    assertEquals(Lumio.rgb(Lumio.DARK_TWINE.get()), "rgb(191, 137, 83)");
    assertEquals(Lumio.rgb(Lumio.TWINE.get()), "rgb(197, 151, 89)");
    assertEquals(Lumio.rgb(Lumio.APACHE.get()), "rgb(203, 166, 91)");
  }

  @Test
  public void shouldReturnTheCorrectRGBColorCodeForPaletteEleven() {
    assertEquals(Lumio.rgb(Lumio.DARK_ROPE.get()), "rgb(148, 95, 60)");
    assertEquals(Lumio.rgb(Lumio.RUSTY_TWINE.get()), "rgb(178, 129, 66)");
    assertEquals(Lumio.rgb(Lumio.HOKEY_POKEY.get()), "rgb(205, 165, 68)");
    assertEquals(Lumio.rgb(Lumio.PORTICA.get()), "rgb(236, 207, 73)");
  }

  @Test
  public void shouldReturnTheCorrectRGBColorCodeForPaletteTwelve() {
    assertEquals(Lumio.rgb(Lumio.ALERT_TAN.get()), "rgb(141, 73, 43)");
    assertEquals(Lumio.rgb(Lumio.PIPER.get()), "rgb(156, 82, 47)");
    assertEquals(Lumio.rgb(Lumio.RICH_GOLD.get()), "rgb(173, 94, 51)");
    assertEquals(Lumio.rgb(Lumio.BAMBOO.get()), "rgb(191, 107, 62)");
    assertEquals(Lumio.rgb(Lumio.ZEST.get()), "rgb(207, 123, 67)");
  }

  @Test
  public void shouldReturnTheCorrectRGBColorCodeForPaletteThirteen() {
    assertEquals(Lumio.rgb(Lumio.VERDUN_GREEN.get()), "rgb(80, 91, 30)");
    assertEquals(Lumio.rgb(Lumio.RAIN_FOREST.get()), "rgb(98, 107, 32)");
    assertEquals(Lumio.rgb(Lumio.DARK_TRENDY_GREEN.get()), "rgb(119, 121, 34)");
    assertEquals(Lumio.rgb(Lumio.TRENDY_GREEN.get()), "rgb(137, 139, 35)");
    assertEquals(Lumio.rgb(Lumio.CITRON.get()), "rgb(157, 159, 40)");
  }

  @Test
  public void shouldReturnTheCorrectRGBColorCodeForPaletteFourteen() {
    assertEquals(Lumio.rgb(Lumio.BLUE_STONE.get()), "rgb(31, 108, 107)");
    assertEquals(Lumio.rgb(Lumio.DEEP_SEA.get()), "rgb(32, 128, 106)");
    assertEquals(Lumio.rgb(Lumio.AMAZON.get()), "rgb(70, 152, 112)");
    assertEquals(Lumio.rgb(Lumio.DE_YORK.get()), "rgb(117, 180, 122)");
    assertEquals(Lumio.rgb(Lumio.GOSSIP.get()), "rgb(140, 196, 123)");
  }

  @Test
  public void shouldReturnTheCorrectRGBColorCodeForPaletteFifteen() {
    assertEquals(Lumio.rgb(Lumio.MARTINIQUE.get()), "rgb(72, 63, 80)");
    assertEquals(Lumio.rgb(Lumio.TRENDY_PINK.get()), "rgb(102, 77, 110)");
    assertEquals(Lumio.rgb(Lumio.AFFAIR.get()), "rgb(127, 85, 131)");
    assertEquals(Lumio.rgb(Lumio.EMINENCE.get()), "rgb(151, 94, 149)");
    assertEquals(Lumio.rgb(Lumio.PLUM.get()), "rgb(171, 98, 156)");
  }
}
