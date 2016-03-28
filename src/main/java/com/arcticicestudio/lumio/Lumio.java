/*
+++++++++++++++++++++++++++++++++++++++++++
title     Lumio - Java - Lumio            +
project   lumio-java                      +
file      Lumio.java                      +
version   0.1.0                           +
author    Arctic Ice Studio               +
email     development@arcticicestudio.com +
website   http://arcticicestudio.com      +
copyright Copyright (C) 2016              +
created   2016-01-25 14:24 UTC+0100       +
modified  2016-03-28 17:49 UTC+0200       +
+++++++++++++++++++++++++++++++++++++++++++

[Description]
"Lumio" color palette as enumeration for the "Lumio - Java" project.

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

import javafx.scene.paint.Color;
import java.util.regex.Pattern;


/**
 * <a href="https://github.com/arcticicestudio/lumio">Lumio</a> color palette
  * as enumeration of the <a href="https://github.com/arcticicestudio/lumio-java">Lumio - Java</a> project.
 * <div>
 *   <table style="display:inline-block">
 *     <tbody>
 *       <tr>
 *         <td id="dark-livid-wood" style="border:none;width:25px;height:30px;background-color:rgb(36, 28, 28);margin: 0"></td>
 *         <td id="morocco-brown" style="border:none;width:25px;height:30px;background-color:rgb(70, 45, 36);margin:0"></td>
 *         <td id="pharlap" style="border:none;width:25px;height:30px;background-color:rgb(126, 98, 94);margin: 0"></td>
 *         <td id="olive-haze" style="border:none;width:25px;height:30px;background-color:rgb(129, 123, 96);margin: 0"></td>
 *         <td id="oyster-pink" style="border:none;width:25px;height:30px;background-color:rgb(204, 175, 170);margin: 0"></td>
 *         <td id="dark-lochmara" style="border:none;width:25px;height:30px;background-color:rgb(4, 89, 143);margin: 0"></td>
 *         <td id="barossa" style="border:none;width:25px;height:30px;background-color:rgb(85, 58, 71);margin: 0"></td>
 *         <td id="wine-berry" style="border:none;width:25px;height:30px;background-color:rgb(89, 49, 59);margin: 0"></td>
 *         <td id="lusty" style="border:none;width:25px;height:30px;background-color:rgb(132, 60, 53);margin: 0"></td>
 *         <td id="rope" style="border:none;width:25px;height:30px;background-color:rgb(162, 104, 70);margin: 0"></td>
 *         <td id="dark-rope" style="border:none;width:25px;height:30px;background-color:rgb(148, 95, 60);margin: 0"></td>
 *         <td id="alert-tan" style="border:none;width:25px;height:30px;background-color:rgb(141, 73, 43);margin: 0"></td>
 *         <td id="verdun-green" style="border:none;width:25px;height:30px;background-color:rgb(80, 91, 30);margin: 0"></td>
 *         <td id="blue-stone" style="border:none;width:25px;height:30px;background-color:rgb(31, 108, 107);margin: 0"></td>
 *         <td id="martinique" style="border:none;width:25px;height:30px;background-color:rgb(72, 63, 80);margin: 0"></td>
 *       </tr>
 *       <tr>
 *         <td id="livid-brown" style="border:none;width:25px;height:30px;background-color:rgb(50, 39, 38);margin: 0"></td>
 *         <td id="dark-oak" style="border:none;width:25px;height:30px;background-color:rgb(82, 53, 42);margin: 0"></td>
 *         <td id="dark-hemp" style="border:none;width:25px;height:30px;background-color:rgb(140, 113, 104);margin: 0"></td>
 *         <td id="gurkha" style="border:none;width:25px;height:30px;background-color:rgb(149, 142, 111);margin: 0"></td>
 *         <td id="wafer" style="border:none;width:25px;height:30px;background-color:rgb(216, 192, 182);margin: 0"></td>
 *         <td id="lochmara" style="border:none;width:25px;height:30px;background-color:rgb(4, 99, 151);margin: 0"></td>
 *         <td id="black-rose" style="border:none;width:25px;height:30px;background-color:rgb(120, 68, 82);margin: 0"></td>
 *         <td id="sanguine-brown" style="border:none;width:25px;height:30px;background-color:rgb(111, 57, 58);margin: 0"></td>
 *         <td id="mojo" style="border:none;width:25px;height:30px;background-color:rgb(156, 76, 61);margin: 0"></td>
 *         <td id="whiskey" style="border:none;width:25px;height:30px;background-color:rgb(182, 125, 79);margin: 0"></td>
 *         <td id="rusty-twine" style="border:none;width:25px;height:30px;background-color:rgb(178, 129, 66);margin: 0"></td>
 *         <td id="piper" style="border:none;width:25px;height:30px;background-color:rgb(156, 82, 47);margin: 0"></td>
 *         <td id="rain-forest" style="border:none;width:25px;height:30px;background-color:rgb(98, 107, 32);margin: 0"></td>
 *         <td id="deep-sea" style="border:none;width:25px;height:30px;background-color:rgb(32, 128, 106);margin: 0"></td>
 *         <td id="trendy-pink" style="border:none;width:25px;height:30px;background-color:rgb(102, 77, 110);margin: 0"></td>
 *       </tr>
 *       <tr>
 *         <td id="cowboy" style="border:none;width:25px;height:30px;background-color:rgb(68, 53, 51);margin: 0"></td>
 *         <td id="cioccolato" style="border:none;width:25px;height:30px;background-color:rgb(93, 57, 42);margin: 0"></td>
 *         <td id="hemp" style="border:none;width:25px;height:30px;background-color:rgb(157, 130, 117);margin: 0"></td>
 *         <td id="hillary" style="border:none;width:25px;height:30px;background-color:rgb(169, 163, 126);margin: 0"></td>
 *         <td id="bizarre" style="border:none;width:25px;height:30px;background-color:rgb(227, 208, 196);margin: 0"></td>
 *         <td id="curious-blue" style="border:none;width:25px;height:30px;background-color:rgb(4, 108, 165);margin: 0"></td>
 *         <td id="merlot" style="border:none;width:25px;height:30px;background-color:rgb(144, 72, 81);margin: 0"></td>
 *         <td id="nutmeg" style="border:none;width:25px;height:30px;background-color:rgb(128, 72, 61);margin: 0"></td>
 *         <td id="tuscany" style="border:none;width:25px;height:30px;background-color:rgb(173, 97, 67);margin: 0"></td>
 *         <td id="dark-twine" style="border:none;width:25px;height:30px;background-color:rgb(191, 137, 83);margin: 0"></td>
 *         <td id="hokey-pokey" style="border:none;width:25px;height:30px;background-color:rgb(205, 165, 68);margin: 0"></td>
 *         <td id="rich-gold" style="border:none;width:25px;height:30px;background-color:rgb(173, 94, 51);margin: 0"></td>
 *         <td id="dark-trendy-green" style="border:none;width:25px;height:30px;background-color:rgb(119, 121, 34);margin: 0"></td>
 *         <td id="amazon" style="border:none;width:25px;height:30px;background-color:rgb(70, 152, 112);margin: 0"></td>
 *         <td id="affair" style="border:none;width:25px;height:30px;background-color:rgb(127, 85, 131);margin: 0"></td>
 *       </tr>
 *       <tr>
 *         <td id="kabul" style="border:none;width:25px;height:30px;background-color:rgb(106, 90, 78);margin: 0"></td>
 *         <td id="old-copper" style="border:none;width:25px;height:30px;background-color:rgb(104, 64, 47);margin: 0"></td>
 *         <td id="sandrift" style="border:none;width:25px;height:30px;background-color:rgb(169, 145, 126);margin: 0"></td>
 *         <td id="white-rock" style="border:none;width:25px;height:30px;background-color:rgb(204, 201, 170);margin: 0"></td>
 *         <td id="quarter-spanish-white" style="border:none;width:25px;height:30px;background-color:rgb(233, 219, 204);margin: 0"></td>
 *         <td id="boston-blue" style="border:none;width:25px;height:30px;background-color:rgb(4, 128, 164);margin: 0"></td>
 *         <td id="roof-terracotta" style="border:none;width:25px;height:30px;background-color:rgb(168, 78, 78);margin: 0"></td>
 *         <td id="paarl" style="border:none;width:25px;height:30px;background-color:rgb(147, 87, 63);margin: 0"></td>
 *         <td id="bourbon" style="border:none;width:25px;height:30px;background-color:rgb(186, 120, 69);margin: 0"></td>
 *         <td id="twine" style="border:none;width:25px;height:30px;background-color:rgb(197, 151, 89);margin: 0"></td>
 *         <td id="portica" style="border:none;width:25px;height:30px;background-color:rgb(236, 207, 73);margin: 0"></td>
 *         <td id="bamboo" style="border:none;width:25px;height:30px;background-color:rgb(191, 107, 62);margin: 0"></td>
 *         <td id="trendy-green" style="border:none;width:25px;height:30px;background-color:rgb(137, 139, 35);margin: 0"></td>
 *         <td id="de-york" style="border:none;width:25px;height:30px;background-color:rgb(117, 180, 122);margin: 0"></td>
 *         <td id="eminence" style="border:none;width:25px;height:30px;background-color:rgb(151, 94, 149);margin: 0"></td>
 *       </tr>
 *       <tr>
 *         <td id="pine-cone" style="border:none;width:25px;height:30px;background-color:rgb(121, 106, 88);margin: 0"></td>
 *         <td id="bull-shot" style="border:none;width:25px;height:30px;background-color:rgb(122, 72, 48);margin: 0"></td>
 *         <td></td>
 *         <td></td>
 *         <td></td>
 *         <td id="viking" style="border:none;width:25px;height:30px;background-color:rgb(19, 152, 169);margin: 0"></td>
 *         <td id="flame-pea" style="border:none;width:25px;height:30px;background-color:rgb(193, 96, 77);margin: 0"></td>
 *         <td id="red-beech" style="border:none;width:25px;height:30px;background-color:rgb(163, 106, 65);margin: 0"></td>
 *         <td id="anzac" style="border:none;width:25px;height:30px;background-color:rgb(201, 145, 71);margin: 0"></td>
 *         <td id="apache" style="border:none;width:25px;height:30px;background-color:rgb(203, 166, 91);margin: 0"></td>
 *         <td></td>
 *         <td id="zest" style="border:none;width:25px;height:30px;background-color:rgb(207, 123, 67);margin: 0"></td>
 *         <td id="citron" style="border:none;width:25px;height:30px;background-color:rgb(157, 159, 40);margin: 0"></td>
 *         <td id="gossip" style="border:none;width:25px;height:30px;background-color:rgb(140, 196, 123);margin: 0"></td>
 *         <td id="plum" style="border:none;width:25px;height:30px;background-color:rgb(171, 98, 156);margin: 0"></td>
 *       </tr>
 *       <tr>
 *         <td></td>
 *         <td id="korma" style="border:none;width:25px;height:30px;background-color:rgb(136, 87, 53);margin: 0"></td>
 *         <td></td>
 *         <td></td>
 *         <td></td>
 *         <td id="java" style="border:none;width:25px;height:30px;background-color:rgb(38, 164, 173);margin: 0"></td>
 *         <td id="japonica" style="border:none;width:25px;height:30px;background-color:rgb(212, 112, 85);margin: 0"></td>
 *         <td id="dirty-twine" style="border:none;width:25px;height:30px;background-color:rgb(178, 129, 66);margin: 0"></td>
 *         <td></td>
 *         <td></td>
 *         <td></td>
 *         <td></td>
 *         <td></td>
 *         <td></td>
 *       </tr>
 *       <tr>
 *         <td></td>
 *         <td id="natural" style="border:none;width:25px;height:30px;background-color:rgb(151, 101, 56);margin: 0"></td>
 *         <td></td>
 *         <td></td>
 *         <td></td>
 *         <td id="sea-green" style="border:none;width:25px;height:30px;background-color:rgb(54, 180, 176);margin: 0"></td>
 *         <td></td>
 *         <td></td>
 *         <td></td>
 *         <td></td>
 *         <td></td>
 *         <td></td>
 *         <td></td>
 *         <td></td>
 *         <td></td>
 *       </tr>
 *       <tr>
 *         <td></td>
 *         <td id="rusty-nail" style="border:none;width:25px;height:30px;background-color:rgb(163, 116, 59);margin: 0"></td>
 *         <td></td>
 *         <td></td>
 *         <td></td>
 *         <td id="light-sea-green" style="border:none;width:25px;height:30px;background-color:rgb(77, 196, 177);margin: 0"></td>
 *         <td></td>
 *         <td></td>
 *         <td></td>
 *         <td></td>
 *         <td></td>
 *         <td></td>
 *         <td></td>
 *         <td></td>
 *         <td></td>
 *       </tr>
 *       <tr>
 *         <td></td>
 *         <td id="tussock" style="border:none;width:25px;height:30px;background-color:rgb(175, 135, 62);margin: 0"></td>
 *         <td></td>
 *         <td></td>
 *         <td></td>
 *         <td id="aquamarine" style="border:none;width:25px;height:30px;background-color:rgb(84, 222, 178);margin: 0"></td>
 *         <td></td>
 *         <td></td>
 *         <td></td>
 *         <td></td>
 *         <td></td>
 *         <td></td>
 *         <td></td>
 *         <td></td>
 *         <td></td>
 *       </tr>
 *     </tbody>
 *   </table>
 * </div>
 *
 * @author Arctic Ice Studio <development@arcticicestudio.com>
 * @see <a href="https://github.com/arcticicestudio/lumio">"Lumio" GitHub Repository</a>
 * @see <a href="https://github.com/arcticicestudio/lumio-java">"Lumio - Java" GitHub Repository</a>
 * @since 0.1.0
 */
public enum Lumio {
  /**
   * The color {@code dark-livid-wood} ({@code p1c1}) with an RGB value of {@code rgb(36, 28, 28)} and HEX value of {@code #241C1C}.
   * <div style="border:none;width:25px;height:30px;background-color:rgb(36, 28, 28);margin: 0"></div>
   */
  DARK_LIVID_WOOD(36, 28, 28),
  /**
   * The color {@code livid-brown} ({@code p1c2}) with an RGB value of {@code rgb(50, 39, 38)} and HEX value of {@code #322726}.
   * <div style="border:none;width:25px;height:30px;background-color:rgb(50, 39, 38);margin: 0"></div>
   */
  LIVID_BROWN(50, 39, 38),
  /**
   * The color {@code cowboy} ({@code p1c3}) with an RGB value of {@code rgb(68, 53, 51)} and HEX value of {@code #443533}.
   * <div style="border:none;width:25px;height:30px;background-color:rgb(68, 53, 51);margin: 0"></div>
   */
  COWBOY(68, 53, 51),
  /**
   * The color {@code kabul} ({@code p1c4}) with an RGB value of {@code rgb(106, 90, 78)} and HEX value of {@code #6A5A4E}.
   * <div style="border:none;width:25px;height:30px;background-color:rgb(106, 90, 78);margin: 0"></div>
   */
  KABUL(106, 90, 78),
  /**
   * The color {@code pine-cone} ({@code p1c5}) with an RGB value of {@code rgb(121, 106, 88)} and HEX value of {@code #796A58}.
   * <div style="border:none;width:25px;height:30px;background-color:rgb(121, 106, 88);margin: 0"></div>
   */
  PINE_CONE(121, 106, 88),
  /**
   * The color {@code morocco-brown} ({@code p2c1}) with an RGB value of {@code rgb(70, 45, 36)} and HEX value of {@code #462D24}.
   * <div style="border:none;width:25px;height:30px;background-color:rgb(70, 45, 36);margin: 0"></div>
   */
  MOROCCO_BROWN(70, 45, 36),
  /**
   * The color {@code dark-oak} ({@code p2c2}) with an RGB value of {@code rgb(82, 53, 42)} and HEX value of {@code #52352A}.
   * <div style="border:none;width:25px;height:30px;background-color:rgb(82, 53, 42);margin: 0"></div>
   */
  DARK_OAK(82, 53, 42),
  /**
   * The color {@code cioccolato} ({@code p2c3}) with an RGB value of {@code rgb(93, 57, 42)} and HEX value of {@code #5D392A}.
   * <div style="border:none;width:25px;height:30px;background-color:rgb(93, 57, 42);margin: 0"></div>
   */
  CIOCCOLATO(93, 57, 42),
  /**
   * The color {@code old-copper} ({@code p2c4}) with an RGB value of {@code rgb(104, 64, 47)} and HEX value of {@code #68402F}.
   * <div style="border:none;width:25px;height:30px;background-color:rgb(104, 64, 47);margin: 0"></div>
   */
  OLD_COPPER(104, 64, 47),
  /**
   * The color {@code bull-shot} ({@code p2c5}) with an RGB value of {@code rgb(122, 72, 48)} and HEX value of {@code #7A4830}.
   * <div style="border:none;width:25px;height:30px;background-color:rgb(122, 72, 48);margin: 0"></div>
   */
  BULL_SHOT(122, 72, 48),
  /**
   * The color {@code korma} ({@code p2c6}) with an RGB value of {@code rgb(136, 87, 53)} and HEX value of {@code #885735}.
   * <div style="border:none;width:25px;height:30px;background-color:rgb(136, 87, 53);margin: 0"></div>
   */
  KORMA(136, 87, 53),
  /**
   * The color {@code natural} ({@code p2c7}) with an RGB value of {@code rgb(151, 101, 56)} and HEX value of {@code #976538}.
   * <div style="border:none;width:25px;height:30px;background-color:rgb(151, 101, 56);margin: 0"></div>
   */
  NATURAL(151, 101, 56),
  /**
   * The color {@code rusty-nail} ({@code p2c8}) with an RGB value of {@code rgb(163, 116, 59)} and HEX value of {@code #A3743B}.
   * <div style="border:none;width:25px;height:30px;background-color:rgb(163, 116, 59);margin: 0"></div>
   */
  RUSTY_NAIL(163, 116, 59),
  /**
   * The color {@code tussock} ({@code p2c9}) with an RGB value of {@code rgb(175, 135, 62)} and HEX value of {@code #AF873E}.
   * <div style="border:none;width:25px;height:30px;background-color:rgb(175, 135, 62);margin: 0"></div>
   */
  TUSSOCK(175, 135, 62),
  /**
   * The color {@code pharlap} ({@code p3c1}) with an RGB value of {@code rgb(126, 98, 94)} and HEX value of {@code #7E625E}.
   * <div style="border:none;width:25px;height:30px;background-color:rgb(126, 98, 94);margin: 0"></div>
   */
  PHARLAP(126, 98, 94),
  /**
   * The color {@code dark-hemp} ({@code p3c2}) with an RGB value of {@code rgb(140, 113, 104)} and HEX value of {@code #8C7168}.
   * <div style="border:none;width:25px;height:30px;background-color:rgb(140, 113, 104);margin: 0"></div>
   */
  DARK_HEMP(140, 113, 104),
  /**
   * The color {@code hemp} ({@code p3c3}) with an RGB value of {@code rgb(157, 130, 117)} and HEX value of {@code #9D8275}.
   * <div style="border:none;width:25px;height:30px;background-color:rgb(157, 130, 117);margin: 0"></div>
   */
  HEMP(157, 130, 117),
  /**
   * The color {@code sandrift} ({@code p3c4}) with an RGB value of {@code rgb(169, 145, 126)} and HEX value of {@code #A9917E}.
   * <div style="border:none;width:25px;height:30px;background-color:rgb(169, 145, 126);margin: 0"></div>
   */
  SANDRIFT(169, 145, 126),
  /**
   * The color {@code olive-haze} ({@code p4c1}) with an RGB value of {@code rgb(129, 123, 96)} and HEX value of {@code #817B60}.
   * <div style="border:none;width:25px;height:30px;background-color:rgb(129, 123, 96);margin: 0"></div>
   */
  OLIVE_HAZE(129, 123, 96),
  /**
   * The color {@code gurkha} ({@code p4c2}) with an RGB value of {@code rgb(149, 142, 111)} and HEX value of {@code #958E6F}.
   * <div style="border:none;width:25px;height:30px;background-color:rgb(149, 142, 111);margin: 0"></div>
   */
  GURKHA(149, 142, 111),
  /**
   * The color {@code hillary} ({@code p4c3}) with an RGB value of {@code rgb(169, 163, 126)} and HEX value of {@code #A9A37E}.
   * <div style="border:none;width:25px;height:30px;background-color:rgb(169, 163, 126);margin: 0"></div>
   */
  HILLARY(169, 163, 126),
  /**
   * The color {@code white-rock} ({@code p4c4}) with an RGB value of {@code rgb(204, 201, 170)} and HEX value of {@code #CCC9AA}.
   * <div style="border:none;width:25px;height:30px;background-color:rgb(204, 201, 170);margin: 0"></div>
   */
  WHITE_ROCK(204, 201, 170),
  /**
   * The color {@code oyster-pink} ({@code p5c1}) with an RGB value of {@code rgb(204, 175, 170)} and HEX value of {@code #CCAFAA}.
   * <div style="border:none;width:25px;height:30px;background-color:rgb(204, 175, 170);margin: 0"></div>
   */
  OYSTER_PINK(204, 175, 170),
  /**
   * The color {@code wafer} ({@code p5c2}) with an RGB value of {@code rgb(216, 192, 182)} and HEX value of {@code #D8C0B6}.
   * <div style="border:none;width:25px;height:30px;background-color:rgb(216, 192, 182);margin: 0"></div>
   */
  WAFER(216, 192, 182),
  /**
   * The color {@code bizarre} ({@code p5c3}) with an RGB value of {@code rgb(227, 208, 196)} and HEX value of {@code #E3D0C4}.
   * <div style="border:none;width:25px;height:30px;background-color:rgb(227, 208, 196);margin: 0"></div>
   */
  BIZZARE(227, 208, 196),
  /**
   * The color {@code quarter-spanish-white} ({@code p5c4}) with an RGB value of {@code rgb(233, 219, 204)} and HEX value of {@code #E9DBCC}.
   * <div style="border:none;width:25px;height:30px;background-color:rgb(233, 219, 204);margin: 0"></div>
   */
  QUARTER_SPANISH_WHITE(233, 219, 204),
  /**
   * The color {@code dark-lochmara} ({@code p6c1}) with an RGB value of {@code rgb(4, 89, 143)} and HEX value of {@code #04598F}.
   * <div style="border:none;width:25px;height:30px;background-color:rgb(4, 89, 143);margin: 0"></div>
   */
  DARK_LOCHMARA(4, 89, 143),
  /**
   * The color {@code lochmara} ({@code p6c2}) with an RGB value of {@code rgb(4, 99, 151)} and HEX value of {@code #046397}.
   * <div style="border:none;width:25px;height:30px;background-color:rgb(4, 99, 151);margin: 0"></div>
   */
  LOCHMARA(4, 99, 151),
  /**
   * The color {@code curious-blue} ({@code p6c3}) with an RGB value of {@code rgb(4, 108, 165)} and HEX value of {@code #046CA5}.
   * <div style="border:none;width:25px;height:30px;background-color:rgb(4, 108, 165);margin: 0"></div>
   */
  CURIOUS_BLUE(4, 108, 165),
  /**
   * The color {@code boston-blue} ({@code p6c4}) with an RGB value of {@code rgb(4, 128, 164)} and HEX value of {@code #0480A4}.
   * <div style="border:none;width:25px;height:30px;background-color:rgb(4, 128, 164);margin: 0"></div>
   */
  BOSTON_BLUE(4, 128, 164),
  /**
   * The color {@code viking} ({@code p6c5}) with an RGB value of {@code rgb(19, 152, 169)} and HEX value of {@code #1398A9}.
   * <div style="border:none;width:25px;height:30px;background-color:rgb(19, 152, 169);margin: 0"></div>
   */
  VIKING(19, 152, 169),
  /**
   * The color {@code java} ({@code p6c6}) with an RGB value of {@code rgb(38, 164, 173)} and HEX value of {@code #26A4AD}.
   * <div style="border:none;width:25px;height:30px;background-color:rgb(38, 164, 173);margin: 0"></div>
   */
  JAVA(38, 164, 173),
  /**
   * The color {@code sea-green} ({@code p6c7}) with an RGB value of {@code rgb(54, 180, 176)} and HEX value of {@code #36B4B0}.
   * <div style="border:none;width:25px;height:30px;background-color:rgb(54, 180, 176);margin: 0"></div>
   */
  SEA_GREEN(54, 180, 176),
  /**
   * The color {@code light-sea-green} ({@code p6c8}) with an RGB value of {@code rgb(77, 196, 177)} and HEX value of {@code #4DC4B1}.
   * <div style="border:none;width:25px;height:30px;background-color:rgb(77, 196, 177);margin: 0"></div>
   */
  LIGHT_SEA_GREEN(77, 196, 177),
  /**
   * The color {@code aquamarine} ({@code p6c9}) with an RGB value of {@code rgb(84, 222, 178)} and HEX value of {@code #54DEB2}.
   * <div style="border:none;width:25px;height:30px;background-color:rgb(84, 222, 178);margin: 0"></div>
   */
  AQUAMARINE(84, 222, 178),
  /**
   * The color {@code barossa} ({@code p7c1}) with an RGB value of {@code rgb(85, 58, 71)} and HEX value of {@code #553A47}.
   * <div style="border:none;width:25px;height:30px;background-color:rgb(85, 58, 71);margin: 0"></div>
   */
  BAROSSA(85, 58, 71),
  /**
   * The color {@code black-rose} ({@code p7c2}) with an RGB value of {@code rgb(120, 68, 82)} and HEX value of {@code #784452}.
   * <div style="border:none;width:25px;height:30px;background-color:rgb(120, 68, 82);margin: 0"></div>
   */
  BLACK_ROSE(120, 68, 82),
  /**
   * The color {@code merlot} ({@code p7c3}) with an RGB value of {@code rgb(144, 72, 81)} and HEX value of {@code #904851}.
   * <div style="border:none;width:25px;height:30px;background-color:rgb(144, 72, 81);margin: 0"></div>
   */
  MERLOT(144, 72, 81),
  /**
   * The color {@code roof-terracotta} ({@code p7c4}) with an RGB value of {@code rgb(168, 78, 78)} and HEX value of {@code #A84E4E}.
   * <div style="border:none;width:25px;height:30px;background-color:rgb(168, 78, 78);margin: 0"></div>
   */
  ROOF_TERRACOTTA(168, 78, 78),
  /**
   * The color {@code flame-pea} ({@code p7c5}) with an RGB value of {@code rgb(193, 96, 77)} and HEX value of {@code #C1604D}.
   * <div style="border:none;width:25px;height:30px;background-color:rgb(193, 96, 77);margin: 0"></div>
   */
  FLAME_PEA (193, 96, 77),
  /**
   * The color {@code japonica} ({@code p7c6}) with an RGB value of {@code rgb(212, 112, 85)} and HEX value of {@code #D47055}.
   * <div style="border:none;width:25px;height:30px;background-color:rgb(212, 112, 85);margin: 0"></div>
   */
  JAPONICA(212, 112, 85),
  /**
   * The color {@code wine-berry} ({@code p8c1}) with an RGB value of {@code rgb(89, 49, 59)} and HEX value of {@code #59313B}.
   * <div style="border:none;width:25px;height:30px;background-color:rgb(89, 49, 59);margin: 0"></div>
   */
  WINE_BERRY(89, 49, 59),
  /**
   * The color {@code sanguine-brown} ({@code p8c2}) with an RGB value of {@code rgb(111, 57, 58)} and HEX value of {@code #6F393A}.
   * <div style="border:none;width:25px;height:30px;background-color:rgb(111, 57, 58);margin: 0"></div>
   */
  SANGUINE_BROWN(111, 57, 58),
  /**
   * The color {@code nutmeg} ({@code p8c3}) with an RGB value of {@code rgb(128, 72, 61)} and HEX value of {@code #80483D}.
   * <div style="border:none;width:25px;height:30px;background-color:rgb(128, 72, 61);margin: 0"></div>
   */
  NUTMEG(128, 72, 61),
  /**
   * The color {@code paarl} ({@code p8c4}) with an RGB value of {@code rgb(147, 87, 63)} and HEX value of {@code #93573F}.
   * <div style="border:none;width:25px;height:30px;background-color:rgb(147, 87, 63);margin: 0"></div>
   */
  PAARL(147, 87, 63),
  /**
   * The color {@code red-beech} ({@code p8c5}) with an RGB value of {@code rgb(163, 106, 65)} and HEX value of {@code #A36A41}.
   * <div style="border:none;width:25px;height:30px;background-color:rgb(163, 106, 65);margin: 0"></div>
   */
  RED_BEECH (163, 106, 65),
  /**
   * The color {@code dirty-twine} ({@code p8c6}) with an RGB value of {@code rgb(178, 129, 66)} and HEX value of {@code #B28142}.
   * <div style="border:none;width:25px;height:30px;background-color:rgb(178, 129, 66);margin: 0"></div>
   */
  DIRTY_TWINE(178, 129, 66),
  /**
   * The color {@code lusty} ({@code p9c1}) with an RGB value of {@code rgb(132, 60, 53)} and HEX value of {@code #843C35}.
   * <div style="border:none;width:25px;height:30px;background-color:rgb(132, 60, 53);margin: 0"></div>
   */
  LUSTY(132, 60, 53),
  /**
   * The color {@code mojo} ({@code p9c2}) with an RGB value of {@code rgb(156, 76, 61)} and HEX value of {@code #9C4C3D}.
   * <div style="border:none;width:25px;height:30px;background-color:rgb(156, 76, 61);margin: 0"></div>
   */
  MOJO(156, 76, 61),
  /**
   * The color {@code tuscany} ({@code p9c3}) with an RGB value of {@code rgb(173, 97, 67)} and HEX value of {@code #AD6143}.
   * <div style="border:none;width:25px;height:30px;background-color:rgb(173, 97, 67);margin: 0"></div>
   */
  TUSCANY(173, 97, 67),
  /**
   * The color {@code bourbon} ({@code p9c4}) with an RGB value of {@code rgb(186, 120, 69)} and HEX value of {@code #BA7845}.
   * <div style="border:none;width:25px;height:30px;background-color:rgb(186, 120, 69);margin: 0"></div>
   */
  BOURBON(186, 120, 69),
  /**
   * The color {@code anzac} ({@code p9c5}) with an RGB value of {@code rgb(201, 145, 71)} and HEX value of {@code #C99147}.
   * <div style="border:none;width:25px;height:30px;background-color:rgb(201, 145, 71);margin: 0"></div>
   */
  ANZAC (201, 145, 71),
  /**
   * The color {@code rope} ({@code p10c1}) with an RGB value of {@code rgb(162, 104, 70)} and HEX value of {@code #A26846}.
   * <div style="border:none;width:25px;height:30px;background-color:rgb(162, 104, 70);margin: 0"></div>
   */
  ROPE(162, 104, 70),
  /**
   * The color {@code whiskey} ({@code p10c2}) with an RGB value of {@code rgb(182, 125, 79)} and HEX value of {@code #B67D4F}.
   * <div style="border:none;width:25px;height:30px;background-color:rgb(182, 125, 79);margin: 0"></div>
   */
  WHISKEY(182, 125, 79),
  /**
   * The color {@code dark-twine} ({@code p10c3}) with an RGB value of {@code rgb(191, 137, 83)} and HEX value of {@code #BF8953}.
   * <div style="border:none;width:25px;height:30px;background-color:rgb(191, 137, 83);margin: 0"></div>
   */
  DARK_TWINE(191, 137, 83),
  /**
   * The color {@code twine} ({@code p10c4}) with an RGB value of {@code rgb(197, 151, 89)} and HEX value of {@code #C59759}.
   * <div style="border:none;width:25px;height:30px;background-color:rgb(197, 151, 89);margin: 0"></div>
   */
  TWINE(197, 151, 89),
  /**
   * The color {@code apache} ({@code p10c5}) with an RGB value of {@code rgb(203, 166, 91)} and HEX value of {@code #CBA65B}.
   * <div style="border:none;width:25px;height:30px;background-color:rgb(203, 166, 91);margin: 0"></div>
   */
  APACHE (203, 166, 91),
  /**
   * The color {@code dark-rope} ({@code p11c1}) with an RGB value of {@code rgb(148, 95, 60)} and HEX value of {@code #945F3C}.
   * <div style="border:none;width:25px;height:30px;background-color:rgb(148, 95, 60);margin: 0"></div>
   */
  DARK_ROPE(148, 95, 60),
  /**
   * The color {@code rusty-twine} ({@code p11c2}) with an RGB value of {@code rgb(178, 129, 66)} and HEX value of {@code #B28142}.
   * <div style="border:none;width:25px;height:30px;background-color:rgb(178, 129, 66);margin: 0"></div>
   */
  RUSTY_TWINE(178, 129, 66),
  /**
   * The color {@code hokey-pokey} ({@code p11c3}) with an RGB value of {@code rgb(205, 165, 68)} and HEX value of {@code #CDA544}.
   * <div style="border:none;width:25px;height:30px;background-color:rgb(205, 165, 68);margin: 0"></div>
   */
  HOKEY_POKEY(205, 165, 68),
  /**
   * The color {@code portica} ({@code p11c4}) with an RGB value of {@code rgb(236, 207, 73)} and HEX value of {@code #ECCF49}.
   * <div style="border:none;width:25px;height:30px;background-color:rgb(236, 207, 73);margin: 0"></div>
   */
  PORTICA(236, 207, 73),
  /**
   * The color {@code alert-tan} ({@code p12c1}) with an RGB value of {@code rgb(141, 73, 43)} and HEX value of {@code #8D492B}.
   * <div style="border:none;width:25px;height:30px;background-color:rgb(141, 73, 43);margin: 0"></div>
   */
  ALERT_TAN(141, 73, 43),
  /**
   * The color {@code piper} ({@code p12c2}) with an RGB value of {@code rgb(156, 82, 47)} and HEX value of {@code #9C522F}.
   * <div style="border:none;width:25px;height:30px;background-color:rgb(156, 82, 47);margin: 0"></div>
   */
  PIPER(156, 82, 47),
  /**
   * The color {@code rich-gold} ({@code p12c3}) with an RGB value of {@code rgb(173, 94, 51)} and HEX value of {@code #AD5E33}.
   * <div style="border:none;width:25px;height:30px;background-color:rgb(173, 94, 51);margin: 0"></div>
   */
  RICH_GOLD(173, 94, 51),
  /**
   * The color {@code bamboo} ({@code p12c4}) with an RGB value of {@code rgb(191, 107, 62)} and HEX value of {@code #BF6B3E}.
   * <div style="border:none;width:25px;height:30px;background-color:rgb(191, 107, 62);margin: 0"></div>
   */
  BAMBOO(191, 107, 62),
  /**
   * The color {@code zest} ({@code p12c5}) with an RGB value of {@code rgb(207, 123, 67)} and HEX value of {@code #CF7B43}.
   * <div style="border:none;width:25px;height:30px;background-color:rgb(207, 123, 67);margin: 0"></div>
   */
  ZEST (207, 123, 67),
  /**
   * The color {@code verdun-green} ({@code p13c1}) with an RGB value of {@code rgb(80, 91, 30)} and HEX value of {@code #505B1E}.
   * <div style="border:none;width:25px;height:30px;background-color:rgb(80, 91, 30);margin: 0"></div>
   */
  VERDUN_GREEN(80, 91, 30),
  /**
   * The color {@code rain-forest} ({@code p13c2}) with an RGB value of {@code rgb(98, 107, 32)} and HEX value of {@code #626B20}.
   * <div style="border:none;width:25px;height:30px;background-color:rgb(98, 107, 32);margin: 0"></div>
   */
  RAIN_FOREST(98, 107, 32),
  /**
   * The color {@code dark-trendy-green} ({@code p13c3}) with an RGB value of {@code rgb(119, 121, 34)} and HEX value of {@code #777922}.
   * <div style="border:none;width:25px;height:30px;background-color:rgb(119, 121, 34);margin: 0"></div>
   */
  DARK_TRENDY_GREEN(119, 121, 34),
  /**
   * The color {@code trendy-green} ({@code p13c4}) with an RGB value of {@code rgb(137, 139, 35)} and HEX value of {@code #898B23}.
   * <div style="border:none;width:25px;height:30px;background-color:rgb(137, 139, 35);margin: 0"></div>
   */
  TRENDY_GREEN(137, 139, 35),
  /**
   * The color {@code citron} ({@code p13c5}) with an RGB value of {@code rgb(157, 159, 40)} and HEX value of {@code #9D9F28}.
   * <div style="border:none;width:25px;height:30px;background-color:rgb(157, 159, 40);margin: 0"></div>
   */
  CITRON (157, 159, 40),
  /**
   * The color {@code blue-stone} ({@code p14c1}) with an RGB value of {@code rgb(31, 108, 107)} and HEX value of {@code #1F6C6B}.
   * <div style="border:none;width:25px;height:30px;background-color:rgb(31, 108, 107);margin: 0"></div>
   */
  BLUE_STONE(31, 108, 107),
  /**
   * The color {@code deep-sea} ({@code p14c2}) with an RGB value of {@code rgb(32, 128, 106)} and HEX value of {@code #20806A}.
   * <div style="border:none;width:25px;height:30px;background-color:rgb(32, 128, 106);margin: 0"></div>
   */
  DEEP_SEA(32, 128, 106),
  /**
   * The color {@code amazon} ({@code p14c3}) with an RGB value of {@code rgb(70, 152, 112)} and HEX value of {@code #469870}.
   * <div style="border:none;width:25px;height:30px;background-color:rgb(70, 152, 112);margin: 0"></div>
   */
  AMAZON(70, 152, 112),
  /**
   * The color {@code de-york} ({@code p14c4}) with an RGB value of {@code rgb(117, 180, 122)} and HEX value of {@code #75B47A}.
   * <div style="border:none;width:25px;height:30px;background-color:rgb(117, 180, 122);margin: 0"></div>
   */
  DE_YORK(117, 180, 122),
  /**
   * The color {@code gossip} ({@code p14c5}) with an RGB value of {@code rgb(140, 196, 123)} and HEX value of {@code #8CC47B}.
   * <div style="border:none;width:25px;height:30px;background-color:rgb(140, 196, 123);margin: 0"></div>
   */
  GOSSIP (140, 196, 123),
  /**
   * The color {@code martinique} ({@code p15c1}) with an RGB value of {@code rgb(72, 63, 80)} and HEX value of {@code #483F50}.
   * <div style="border:none;width:25px;height:30px;background-color:rgb(72, 63, 80);margin: 0"></div>
   */
  MARTINIQUE(72, 63, 80),
  /**
   * The color {@code trendy-pink} ({@code p15c2}) with an RGB value of {@code rgb(102, 77, 110)} and HEX value of {@code #664D6E}.
   * <div style="border:none;width:25px;height:30px;background-color:rgb(102, 77, 110);margin: 0"></div>
   */
  TRENDY_PINK(102, 77, 110),
  /**
   * The color {@code affair} ({@code p15c3}) with an RGB value of {@code rgb(127, 85, 131)} and HEX value of {@code #7F5583}.
   * <div style="border:none;width:25px;height:30px;background-color:rgb(127, 85, 131);margin: 0"></div>
   */
  AFFAIR(127, 85, 131),
  /**
   * The color {@code eminence} ({@code p15c4}) with an RGB value of {@code rgb(151, 94, 149)} and HEX value of {@code #975E95}.
   * <div style="border:none;width:25px;height:30px;background-color:rgb(151, 94, 149);margin: 0"></div>
   */
  EMINENCE(151, 94, 149),
  /**
   * The color {@code plum} ({@code p15c5}) with an RGB value of {@code rgb(171, 98, 156)} and HEX value of {@code #AB629C}.
   * <div style="border:none;width:25px;height:30px;background-color:rgb(171, 98, 156);margin: 0"></div>
   */
  PLUM (171, 98, 156);

  /**
   * Compiled pattern to convert the RGB and HEX color values.
   */
  private static final Pattern COLOR_PREFIX = Pattern.compile("0x", Pattern.LITERAL);

  /**
   * Contains the RGB color code.
   */
  private final Color COLOR;

  /**
   * Constructs a new color object.
   *
   * @param RED The value for the additive primary color {@code red}
   * @param GREEN The value for the additive primary color {@code green}
   * @param BLUE The value for the additive primary color {@code blue}
   */
  Lumio(final int RED, final int GREEN, final int BLUE) {
    COLOR = Color.rgb(RED, GREEN, BLUE);
  }

  /**
   * Converts the color to the {@code RGB} identifier.
   *
   * @param COLOR The color object
   * @return a string representation of the {@code RGB} identifier
   */
  public static String rgb(final Color COLOR) {
    String hex = COLOR_PREFIX.matcher(COLOR.toString()).replaceAll("");
    String hexRed = hex.substring(0, 2).toUpperCase();
    String hexGreen = hex.substring(2, 4).toUpperCase();
    String hexBlue = hex.substring(4, 6).toUpperCase();

    String intRed = Integer.toString(Integer.parseInt(hexRed, 16));
    String intGreen = Integer.toString(Integer.parseInt(hexGreen, 16));
    String intBlue = Integer.toString(Integer.parseInt(hexBlue, 16));

    return String.join("", "rgb(", intRed, ", ", intGreen, ", ", intBlue, ")");
  }

  /**
   * Converts the color to the {@code HEX} identifier.
   *
   * @param COLOR The color object
   * @return a string representation of the {@code HEX} identifier
   */
  public static String hex(final Color COLOR) {
    return COLOR_PREFIX.matcher(COLOR.toString()).replaceAll("#").substring(0, 7).toUpperCase();
  }

  /**
   * Returns the color object.
   *
   * @return the color object
   */
  public Color get() {
    return COLOR;
  }
}
