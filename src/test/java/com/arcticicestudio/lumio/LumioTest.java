/*
++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
title      Lumio Public API Unit Test                    +
project    lumio-java                                    +
repository https://github.com/arcticicestudio/lumio-java +
author     Arctic Ice Studio                             +
email      development@arcticicestudio.com               +
copyright  Copyright (C) 2016                            +
++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
*/
package com.arcticicestudio.lumio;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

/**
 * Unit tests for the "Lumio Java" public API.
 *
 * @author Arctic Ice Studio &lt;development@arcticicestudio.com&gt;
 * @see Lumio
 * @since 0.1.0
 */
public class LumioTest {
  @Test
  public void shouldReturnCorrectHEXColorCodeForRoughCoalComponent() {
    assertEquals(Lumio.hex(Lumio.LUMIO0.get()), "#241C1C");
    assertEquals(Lumio.hex(Lumio.LUMIO1.get()), "#322726");
    assertEquals(Lumio.hex(Lumio.LUMIO2.get()), "#443533");
    assertEquals(Lumio.hex(Lumio.LUMIO3.get()), "#6A5A4E");
    assertEquals(Lumio.hex(Lumio.LUMIO4.get()), "#796A58");
  }

  @Test
  public void shouldReturnCorrectHEXColorCodeForSoftEarthComponent() {
    assertEquals(Lumio.hex(Lumio.LUMIO5.get()), "#462D24");
    assertEquals(Lumio.hex(Lumio.LUMIO6.get()), "#52352A");
    assertEquals(Lumio.hex(Lumio.LUMIO7.get()), "#5D392A");
    assertEquals(Lumio.hex(Lumio.LUMIO8.get()), "#68402F");
    assertEquals(Lumio.hex(Lumio.LUMIO9.get()), "#7A4830");
    assertEquals(Lumio.hex(Lumio.LUMIO10.get()), "#885735");
    assertEquals(Lumio.hex(Lumio.LUMIO11.get()), "#976538");
    assertEquals(Lumio.hex(Lumio.LUMIO12.get()), "#A3743B");
    assertEquals(Lumio.hex(Lumio.LUMIO13.get()), "#AF873E");
  }

  @Test
  public void shouldReturnCorrectHEXColorCodeForHardMetalComponent() {
    assertEquals(Lumio.hex(Lumio.LUMIO14.get()), "#7E625E");
    assertEquals(Lumio.hex(Lumio.LUMIO15.get()), "#8C7168");
    assertEquals(Lumio.hex(Lumio.LUMIO16.get()), "#9D8275");
    assertEquals(Lumio.hex(Lumio.LUMIO17.get()), "#A9917E");
  }

  @Test
  public void shouldReturnCorrectHEXColorCodeForPiquantOliveComponent() {
    assertEquals(Lumio.hex(Lumio.LUMIO18.get()), "#817B60");
    assertEquals(Lumio.hex(Lumio.LUMIO19.get()), "#958E6F");
    assertEquals(Lumio.hex(Lumio.LUMIO20.get()), "#A9A37E");
    assertEquals(Lumio.hex(Lumio.LUMIO21.get()), "#CCC9AA");
  }

  @Test
  public void shouldReturnCorrectHEXColorCodeForColdSnowComponent() {
    assertEquals(Lumio.hex(Lumio.LUMIO22.get()), "#CCAFAA");
    assertEquals(Lumio.hex(Lumio.LUMIO23.get()), "#D8C0B6");
    assertEquals(Lumio.hex(Lumio.LUMIO24.get()), "#E3D0C4");
    assertEquals(Lumio.hex(Lumio.LUMIO25.get()), "#E9DBCC");
  }

  @Test
  public void shouldReturnCorrectHEXColorCodeForClearWaterComponent() {
    assertEquals(Lumio.hex(Lumio.LUMIO26.get()), "#04598F");
    assertEquals(Lumio.hex(Lumio.LUMIO27.get()), "#046397");
    assertEquals(Lumio.hex(Lumio.LUMIO28.get()), "#046CA5");
    assertEquals(Lumio.hex(Lumio.LUMIO29.get()), "#0480A4");
    assertEquals(Lumio.hex(Lumio.LUMIO30.get()), "#1398A9");
    assertEquals(Lumio.hex(Lumio.LUMIO31.get()), "#26A4AD");
    assertEquals(Lumio.hex(Lumio.LUMIO32.get()), "#36B4B0");
    assertEquals(Lumio.hex(Lumio.LUMIO33.get()), "#4DC4B1");
    assertEquals(Lumio.hex(Lumio.LUMIO34.get()), "#54DEB2");
  }

  @Test
  public void shouldReturnCorrectHEXColorCodeForHotFlameComponent() {
    assertEquals(Lumio.hex(Lumio.LUMIO35.get()), "#553A47");
    assertEquals(Lumio.hex(Lumio.LUMIO36.get()), "#784452");
    assertEquals(Lumio.hex(Lumio.LUMIO37.get()), "#904851");
    assertEquals(Lumio.hex(Lumio.LUMIO38.get()), "#A84E4E");
    assertEquals(Lumio.hex(Lumio.LUMIO39.get()), "#C1604D");
    assertEquals(Lumio.hex(Lumio.LUMIO40.get()), "#D47055");
  }

  @Test
  public void shouldReturnCorrectHEXColorCodeForRoastedCocoaBeanComponent() {
    assertEquals(Lumio.hex(Lumio.LUMIO41.get()), "#59313B");
    assertEquals(Lumio.hex(Lumio.LUMIO42.get()), "#6F393A");
    assertEquals(Lumio.hex(Lumio.LUMIO43.get()), "#80483D");
    assertEquals(Lumio.hex(Lumio.LUMIO44.get()), "#93573F");
    assertEquals(Lumio.hex(Lumio.LUMIO45.get()), "#A36A41");
    assertEquals(Lumio.hex(Lumio.LUMIO46.get()), "#B28142");
  }

  @Test
  public void shouldReturnCorrectHEXColorCodeForTropicalWoodComponent() {
    assertEquals(Lumio.hex(Lumio.LUMIO47.get()), "#843C35");
    assertEquals(Lumio.hex(Lumio.LUMIO48.get()), "#9C4C3D");
    assertEquals(Lumio.hex(Lumio.LUMIO49.get()), "#AD6143");
    assertEquals(Lumio.hex(Lumio.LUMIO50.get()), "#BA7845");
    assertEquals(Lumio.hex(Lumio.LUMIO51.get()), "#C99147");
  }

  @Test
  public void shouldReturnCorrectHEXColorCodeForFineSandComponent() {
    assertEquals(Lumio.hex(Lumio.LUMIO52.get()), "#A26846");
    assertEquals(Lumio.hex(Lumio.LUMIO53.get()), "#B67D4F");
    assertEquals(Lumio.hex(Lumio.LUMIO54.get()), "#BF8953");
    assertEquals(Lumio.hex(Lumio.LUMIO55.get()), "#C59759");
    assertEquals(Lumio.hex(Lumio.LUMIO56.get()), "#CBA65B");
  }

  @Test
  public void shouldReturnCorrectHEXColorCodeForSweetBananaComponent() {
    assertEquals(Lumio.hex(Lumio.LUMIO57.get()), "#945F3C");
    assertEquals(Lumio.hex(Lumio.LUMIO58.get()), "#B28142");
    assertEquals(Lumio.hex(Lumio.LUMIO59.get()), "#CDA544");
    assertEquals(Lumio.hex(Lumio.LUMIO60.get()), "#ECCF49");
  }

  @Test
  public void shouldReturnCorrectHEXColorCodeForCalmSunsetComponent() {
    assertEquals(Lumio.hex(Lumio.LUMIO61.get()), "#8D492B");
    assertEquals(Lumio.hex(Lumio.LUMIO62.get()), "#9C522F");
    assertEquals(Lumio.hex(Lumio.LUMIO63.get()), "#AD5E33");
    assertEquals(Lumio.hex(Lumio.LUMIO64.get()), "#BF6B3E");
    assertEquals(Lumio.hex(Lumio.LUMIO65.get()), "#CF7B43");
  }

  @Test
  public void shouldReturnCorrectHEXColorCodeForLivingForestComponent() {
    assertEquals(Lumio.hex(Lumio.LUMIO66.get()), "#505B1E");
    assertEquals(Lumio.hex(Lumio.LUMIO67.get()), "#626B20");
    assertEquals(Lumio.hex(Lumio.LUMIO68.get()), "#777922");
    assertEquals(Lumio.hex(Lumio.LUMIO69.get()), "#898B23");
    assertEquals(Lumio.hex(Lumio.LUMIO70.get()), "#9D9F28");
  }

  @Test
  public void shouldReturnCorrectHEXColorCodeForDeepSeaComponent() {
    assertEquals(Lumio.hex(Lumio.LUMIO71.get()), "#1F6C6B");
    assertEquals(Lumio.hex(Lumio.LUMIO72.get()), "#20806A");
    assertEquals(Lumio.hex(Lumio.LUMIO73.get()), "#469870");
    assertEquals(Lumio.hex(Lumio.LUMIO74.get()), "#75B47A");
    assertEquals(Lumio.hex(Lumio.LUMIO75.get()), "#8CC47B");
  }

  @Test
  public void shouldReturnCorrectHEXColorCodeForFreshWildBerriesComponent() {
    assertEquals(Lumio.hex(Lumio.LUMIO76.get()), "#483F50");
    assertEquals(Lumio.hex(Lumio.LUMIO77.get()), "#664D6E");
    assertEquals(Lumio.hex(Lumio.LUMIO78.get()), "#7F5583");
    assertEquals(Lumio.hex(Lumio.LUMIO79.get()), "#975E95");
    assertEquals(Lumio.hex(Lumio.LUMIO80.get()), "#AB629C");
  }


  @Test
  public void shouldReturnCorrectRGBColorCodeForRoughCoalComponent() {
    assertEquals(Lumio.rgb(Lumio.LUMIO0.get()), "rgb(36, 28, 28)");
    assertEquals(Lumio.rgb(Lumio.LUMIO1.get()), "rgb(50, 39, 38)");
    assertEquals(Lumio.rgb(Lumio.LUMIO2.get()), "rgb(68, 53, 51)");
    assertEquals(Lumio.rgb(Lumio.LUMIO3.get()), "rgb(106, 90, 78)");
    assertEquals(Lumio.rgb(Lumio.LUMIO4.get()), "rgb(121, 106, 88)");
  }

  @Test
  public void shouldReturnCorrectRGBColorCodeForSoftEarthComponent() {
    assertEquals(Lumio.rgb(Lumio.LUMIO5.get()), "rgb(70, 45, 36)");
    assertEquals(Lumio.rgb(Lumio.LUMIO6.get()), "rgb(82, 53, 42)");
    assertEquals(Lumio.rgb(Lumio.LUMIO7.get()), "rgb(93, 57, 42)");
    assertEquals(Lumio.rgb(Lumio.LUMIO8.get()), "rgb(104, 64, 47)");
    assertEquals(Lumio.rgb(Lumio.LUMIO9.get()), "rgb(122, 72, 48)");
    assertEquals(Lumio.rgb(Lumio.LUMIO10.get()), "rgb(136, 87, 53)");
    assertEquals(Lumio.rgb(Lumio.LUMIO11.get()), "rgb(151, 101, 56)");
    assertEquals(Lumio.rgb(Lumio.LUMIO12.get()), "rgb(163, 116, 59)");
    assertEquals(Lumio.rgb(Lumio.LUMIO13.get()), "rgb(175, 135, 62)");
  }

  @Test
  public void shouldReturnCorrectRGBColorCodeForHardMetalComponent() {
    assertEquals(Lumio.rgb(Lumio.LUMIO14.get()), "rgb(126, 98, 94)");
    assertEquals(Lumio.rgb(Lumio.LUMIO15.get()), "rgb(140, 113, 104)");
    assertEquals(Lumio.rgb(Lumio.LUMIO16.get()), "rgb(157, 130, 117)");
    assertEquals(Lumio.rgb(Lumio.LUMIO17.get()), "rgb(169, 145, 126)");
  }

  @Test
  public void shouldReturnCorrectRGBColorCodeForPiquantOliveComponent() {
    assertEquals(Lumio.rgb(Lumio.LUMIO18.get()), "rgb(129, 123, 96)");
    assertEquals(Lumio.rgb(Lumio.LUMIO19.get()), "rgb(149, 142, 111)");
    assertEquals(Lumio.rgb(Lumio.LUMIO20.get()), "rgb(169, 163, 126)");
    assertEquals(Lumio.rgb(Lumio.LUMIO21.get()), "rgb(204, 201, 170)");
  }

  @Test
  public void shouldReturnCorrectRGBColorCodeForColdSnowComponent() {
    assertEquals(Lumio.rgb(Lumio.LUMIO22.get()), "rgb(204, 175, 170)");
    assertEquals(Lumio.rgb(Lumio.LUMIO23.get()), "rgb(216, 192, 182)");
    assertEquals(Lumio.rgb(Lumio.LUMIO24.get()), "rgb(227, 208, 196)");
    assertEquals(Lumio.rgb(Lumio.LUMIO25.get()), "rgb(233, 219, 204)");
  }

  @Test
  public void shouldReturnCorrectRGBColorCodeForClearWaterComponent() {
    assertEquals(Lumio.rgb(Lumio.LUMIO26.get()), "rgb(4, 89, 143)");
    assertEquals(Lumio.rgb(Lumio.LUMIO27.get()), "rgb(4, 99, 151)");
    assertEquals(Lumio.rgb(Lumio.LUMIO28.get()), "rgb(4, 108, 165)");
    assertEquals(Lumio.rgb(Lumio.LUMIO29.get()), "rgb(4, 128, 164)");
    assertEquals(Lumio.rgb(Lumio.LUMIO30.get()), "rgb(19, 152, 169)");
    assertEquals(Lumio.rgb(Lumio.LUMIO31.get()), "rgb(38, 164, 173)");
    assertEquals(Lumio.rgb(Lumio.LUMIO32.get()), "rgb(54, 180, 176)");
    assertEquals(Lumio.rgb(Lumio.LUMIO33.get()), "rgb(77, 196, 177)");
    assertEquals(Lumio.rgb(Lumio.LUMIO34.get()), "rgb(84, 222, 178)");
  }

  @Test
  public void shouldReturnCorrectRGBColorCodeForHotFlameComponent() {
    assertEquals(Lumio.rgb(Lumio.LUMIO35.get()), "rgb(85, 58, 71)");
    assertEquals(Lumio.rgb(Lumio.LUMIO36.get()), "rgb(120, 68, 82)");
    assertEquals(Lumio.rgb(Lumio.LUMIO37.get()), "rgb(144, 72, 81)");
    assertEquals(Lumio.rgb(Lumio.LUMIO38.get()), "rgb(168, 78, 78)");
    assertEquals(Lumio.rgb(Lumio.LUMIO39.get()), "rgb(193, 96, 77)");
    assertEquals(Lumio.rgb(Lumio.LUMIO40.get()), "rgb(212, 112, 85)");
  }

  @Test
  public void shouldReturnCorrectRGBColorCodeForRoastedCocoaBeanComponent() {
    assertEquals(Lumio.rgb(Lumio.LUMIO41.get()), "rgb(89, 49, 59)");
    assertEquals(Lumio.rgb(Lumio.LUMIO42.get()), "rgb(111, 57, 58)");
    assertEquals(Lumio.rgb(Lumio.LUMIO43.get()), "rgb(128, 72, 61)");
    assertEquals(Lumio.rgb(Lumio.LUMIO44.get()), "rgb(147, 87, 63)");
    assertEquals(Lumio.rgb(Lumio.LUMIO45.get()), "rgb(163, 106, 65)");
    assertEquals(Lumio.rgb(Lumio.LUMIO46.get()), "rgb(178, 129, 66)");
  }

  @Test
  public void shouldReturnCorrectRGBColorCodeForTropicalWoodComponent() {
    assertEquals(Lumio.rgb(Lumio.LUMIO47.get()), "rgb(132, 60, 53)");
    assertEquals(Lumio.rgb(Lumio.LUMIO48.get()), "rgb(156, 76, 61)");
    assertEquals(Lumio.rgb(Lumio.LUMIO49.get()), "rgb(173, 97, 67)");
    assertEquals(Lumio.rgb(Lumio.LUMIO50.get()), "rgb(186, 120, 69)");
    assertEquals(Lumio.rgb(Lumio.LUMIO51.get()), "rgb(201, 145, 71)");
  }

  @Test
  public void shouldReturnCorrectRGBColorCodeForFineSandComponent() {
    assertEquals(Lumio.rgb(Lumio.LUMIO52.get()), "rgb(162, 104, 70)");
    assertEquals(Lumio.rgb(Lumio.LUMIO53.get()), "rgb(182, 125, 79)");
    assertEquals(Lumio.rgb(Lumio.LUMIO54.get()), "rgb(191, 137, 83)");
    assertEquals(Lumio.rgb(Lumio.LUMIO55.get()), "rgb(197, 151, 89)");
    assertEquals(Lumio.rgb(Lumio.LUMIO56.get()), "rgb(203, 166, 91)");
  }

  @Test
  public void shouldReturnCorrectRGBColorCodeForSweetBananaComponent() {
    assertEquals(Lumio.rgb(Lumio.LUMIO57.get()), "rgb(148, 95, 60)");
    assertEquals(Lumio.rgb(Lumio.LUMIO58.get()), "rgb(178, 129, 66)");
    assertEquals(Lumio.rgb(Lumio.LUMIO59.get()), "rgb(205, 165, 68)");
    assertEquals(Lumio.rgb(Lumio.LUMIO60.get()), "rgb(236, 207, 73)");
  }

  @Test
  public void shouldReturnCorrectRGBColorCodeForCalmSunsetComponent() {
    assertEquals(Lumio.rgb(Lumio.LUMIO61.get()), "rgb(141, 73, 43)");
    assertEquals(Lumio.rgb(Lumio.LUMIO62.get()), "rgb(156, 82, 47)");
    assertEquals(Lumio.rgb(Lumio.LUMIO63.get()), "rgb(173, 94, 51)");
    assertEquals(Lumio.rgb(Lumio.LUMIO64.get()), "rgb(191, 107, 62)");
    assertEquals(Lumio.rgb(Lumio.LUMIO65.get()), "rgb(207, 123, 67)");
  }

  @Test
  public void shouldReturnCorrectRGBColorCodeForLivingForestComponent() {
    assertEquals(Lumio.rgb(Lumio.LUMIO66.get()), "rgb(80, 91, 30)");
    assertEquals(Lumio.rgb(Lumio.LUMIO67.get()), "rgb(98, 107, 32)");
    assertEquals(Lumio.rgb(Lumio.LUMIO68.get()), "rgb(119, 121, 34)");
    assertEquals(Lumio.rgb(Lumio.LUMIO69.get()), "rgb(137, 139, 35)");
    assertEquals(Lumio.rgb(Lumio.LUMIO70.get()), "rgb(157, 159, 40)");
  }

  @Test
  public void shouldReturnCorrectRGBColorCodeForDeepSeaComponent() {
    assertEquals(Lumio.rgb(Lumio.LUMIO71.get()), "rgb(31, 108, 107)");
    assertEquals(Lumio.rgb(Lumio.LUMIO72.get()), "rgb(32, 128, 106)");
    assertEquals(Lumio.rgb(Lumio.LUMIO73.get()), "rgb(70, 152, 112)");
    assertEquals(Lumio.rgb(Lumio.LUMIO74.get()), "rgb(117, 180, 122)");
    assertEquals(Lumio.rgb(Lumio.LUMIO75.get()), "rgb(140, 196, 123)");
  }

  @Test
  public void shouldReturnCorrectRGBColorCodeForFreshWildBerriesComponent() {
    assertEquals(Lumio.rgb(Lumio.LUMIO76.get()), "rgb(72, 63, 80)");
    assertEquals(Lumio.rgb(Lumio.LUMIO77.get()), "rgb(102, 77, 110)");
    assertEquals(Lumio.rgb(Lumio.LUMIO78.get()), "rgb(127, 85, 131)");
    assertEquals(Lumio.rgb(Lumio.LUMIO79.get()), "rgb(151, 94, 149)");
    assertEquals(Lumio.rgb(Lumio.LUMIO80.get()), "rgb(171, 98, 156)");
  }
}
