/*
+++++++++++++++++++++++++++++++++++++++++++
title     Lumio Public API                +
project   lumio-java                      +
author    Arctic Ice Studio               +
email     development@arcticicestudio.com +
copyright Copyright (C) 2016              +
+++++++++++++++++++++++++++++++++++++++++++
*/
package com.arcticicestudio.lumio;

import javafx.scene.paint.Color;
import java.util.regex.Pattern;

/**
 * A luminous warm and calm color palette.
 * Created for the steam- and comic-like flat design pattern to achieve a optimal unobtrusive feeling for game- and
 * graphic projects.
 * It consists of a total of eighty one, carefully selected, dimmed pastel colors for a eye-comfortable, but yet
 * colorful ambiance.
 * <p>
 *   Public API entry point of the <a href="https://github.com/arcticicestudio/lumio-java">Lumio Java</a> project,
 *   which implements the <a href="https://github.com/arcticicestudio/lumio">Lumio</a> color palette.
 * <div>
 *   <table summary="Lumio Color Palette">
 *     <tbody>
 *       <tr>
 *         <th style="border:0;">Rough Coal</th>
 *         <th style="border:0;width:25px;height:30px;background-color:rgb(36,28,28);margin:0"></th>
 *         <th style="border:0;width:25px;height:30px;background-color:rgb(50,39,38);margin:0"></th>
 *         <th style="border:0;width:25px;height:30px;background-color:rgb(68,53,51);margin:0"></th>
 *         <th style="border:0;width:25px;height:30px;background-color:rgb(106,90,78);margin:0"></th>
 *         <th style="border:0;width:25px;height:30px;background-color:rgb(121,106,88);margin:0"></th>
 *       </tr>
 *       <tr>
 *         <th style="border:0;">Soft Earth</th>
 *         <th style="border:0;width:25px;height:30px;background-color:rgb(70,45,36);margin:0"></th>
 *         <th style="border:0;width:25px;height:30px;background-color:rgb(82,53,42);margin:0"></th>
 *         <th style="border:0;width:25px;height:30px;background-color:rgb(93,57,42);margin:0"></th>
 *         <th style="border:0;width:25px;height:30px;background-color:rgb(104,64,47);margin:0"></th>
 *         <th style="border:0;width:25px;height:30px;background-color:rgb(122,72,48);margin:0"></th>
 *         <th style="border:0;width:25px;height:30px;background-color:rgb(136,87,53);margin:0"></th>
 *         <th style="border:0;width:25px;height:30px;background-color:rgb(151,101,56);margin:0"></th>
 *         <th style="border:0;width:25px;height:30px;background-color:rgb(163,116,59);margin:0"></th>
 *         <th style="border:0;width:25px;height:30px;background-color:rgb(175,135,62);margin:0"></th>
 *       </tr>
 *       <tr>
 *         <th style="border:0;">Hard Metal</th>
 *         <th style="border:0;width:25px;height:30px;background-color:rgb(126,98,94);margin:0"></th>
 *         <th style="border:0;width:25px;height:30px;background-color:rgb(140,113,104);margin:0"></th>
 *         <th style="border:0;width:25px;height:30px;background-color:rgb(157,130,117);margin:0"></th>
 *         <th style="border:0;width:25px;height:30px;background-color:rgb(169,145,126);margin:0"></th>
 *       </tr>
 *       <tr>
 *         <th style="border:0;">Piquant Olive</th>
 *         <th style="border:0;width:25px;height:30px;background-color:rgb(129,123,96);margin:0"></th>
 *         <th style="border:0;width:25px;height:30px;background-color:rgb(149,142,111);margin:0"></th>
 *         <th style="border:0;width:25px;height:30px;background-color:rgb(169,163,126);margin:0"></th>
 *         <th style="border:0;width:25px;height:30px;background-color:rgb(204,201,170);margin:0"></th>
 *       </tr>
 *       <tr>
 *         <th style="border:0;">Cold Snow</th>
 *         <th style="border:0;width:25px;height:30px;background-color:rgb(204,175,170);margin:0"></th>
 *         <th style="border:0;width:25px;height:30px;background-color:rgb(216,192,182);margin:0"></th>
 *         <th style="border:0;width:25px;height:30px;background-color:rgb(227,208,196);margin:0"></th>
 *         <th style="border:0;width:25px;height:30px;background-color:rgb(233,219,204);margin:0"></th>
 *       </tr>
 *       <tr>
 *         <th style="border:0;">Clear Water</th>
 *         <th style="border:0;width:25px;height:30px;background-color:rgb(4,89,143);margin:0"></th>
 *         <th style="border:0;width:25px;height:30px;background-color:rgb(4,99,151);margin:0"></th>
 *         <th style="border:0;width:25px;height:30px;background-color:rgb(4,108,165);margin:0"></th>
 *         <th style="border:0;width:25px;height:30px;background-color:rgb(4,128,164);margin:0"></th>
 *         <th style="border:0;width:25px;height:30px;background-color:rgb(19,152,169);margin:0"></th>
 *         <th style="border:0;width:25px;height:30px;background-color:rgb(38,164,173);margin:0"></th>
 *         <th style="border:0;width:25px;height:30px;background-color:rgb(54,180,176);margin:0"></th>
 *         <th style="border:0;width:25px;height:30px;background-color:rgb(77,196,177);margin:0"></th>
 *         <th style="border:0;width:25px;height:30px;background-color:rgb(84,222,178);margin:0"></th>
 *       </tr>
 *       <tr>
 *         <th style="border:0;">Hot Flame</th>
 *         <th style="border:0;width:25px;height:30px;background-color:rgb(85,58,71);margin:0"></th>
 *         <th style="border:0;width:25px;height:30px;background-color:rgb(120,68,82);margin:0"></th>
 *         <th style="border:0;width:25px;height:30px;background-color:rgb(144,72,81);margin:0"></th>
 *         <th style="border:0;width:25px;height:30px;background-color:rgb(168,78,78);margin:0"></th>
 *         <th style="border:0;width:25px;height:30px;background-color:rgb(193,96,77);margin:0"></th>
 *         <th style="border:0;width:25px;height:30px;background-color:rgb(212,112,85);margin:0"></th>
 *       </tr>
 *       <tr>
 *         <th style="border:0;">Roasted Cocoa Bean</th>
 *         <th style="border:0;width:25px;height:30px;background-color:rgb(89,49,59);margin:0"></th>
 *         <th style="border:0;width:25px;height:30px;background-color:rgb(111,57,58);margin:0"></th>
 *         <th style="border:0;width:25px;height:30px;background-color:rgb(128,72,61);margin:0"></th>
 *         <th style="border:0;width:25px;height:30px;background-color:rgb(147,87,63);margin:0"></th>
 *         <th style="border:0;width:25px;height:30px;background-color:rgb(163,106,65);margin:0"></th>
 *         <th style="border:0;width:25px;height:30px;background-color:rgb(178,129,66);margin:0"></th>
 *       </tr>
 *       <tr>
 *         <th style="border:0;">Tropical Wood</th>
 *         <th style="border:0;width:25px;height:30px;background-color:rgb(132,60,53);margin:0"></th>
 *         <th style="border:0;width:25px;height:30px;background-color:rgb(156,76,61);margin:0"></th>
 *         <th style="border:0;width:25px;height:30px;background-color:rgb(173,97,67);margin:0"></th>
 *         <th style="border:0;width:25px;height:30px;background-color:rgb(186,120,69);margin:0"></th>
 *         <th style="border:0;width:25px;height:30px;background-color:rgb(201,145,71);margin:0"></th>
 *       </tr>
 *       <tr>
 *         <th style="border:0;">Fine Sand</th>
 *         <th style="border:0;width:25px;height:30px;background-color:rgb(162,104,70);margin:0"></th>
 *         <th style="border:0;width:25px;height:30px;background-color:rgb(182,125,79);margin:0"></th>
 *         <th style="border:0;width:25px;height:30px;background-color:rgb(191,137,83);margin:0"></th>
 *         <th style="border:0;width:25px;height:30px;background-color:rgb(197,151,89);margin:0"></th>
 *         <th style="border:0;width:25px;height:30px;background-color:rgb(203,166,91);margin:0"></th>
 *       </tr>
 *       <tr>
 *         <th style="border:0;">Sweet Banana</th>
 *         <th style="border:0;width:25px;height:30px;background-color:rgb(148,95,60);margin:0"></th>
 *         <th style="border:0;width:25px;height:30px;background-color:rgb(178,129,66);margin:0"></th>
 *         <th style="border:0;width:25px;height:30px;background-color:rgb(205,165,68);margin:0"></th>
 *         <th style="border:0;width:25px;height:30px;background-color:rgb(236,207,73);margin:0"></th>
 *       </tr>
 *       <tr>
 *         <th style="border:0;">Calm Sunset</th>
 *         <th style="border:0;width:25px;height:30px;background-color:rgb(141,73,43);margin:0"></th>
 *         <th style="border:0;width:25px;height:30px;background-color:rgb(156,82,47);margin:0"></th>
 *         <th style="border:0;width:25px;height:30px;background-color:rgb(173,94,51);margin:0"></th>
 *         <th style="border:0;width:25px;height:30px;background-color:rgb(191,107,62);margin:0"></th>
 *         <th style="border:0;width:25px;height:30px;background-color:rgb(207,123,67);margin:0"></th>
 *       </tr>
 *       <tr>
 *         <th style="border:0;">Living Forest</th>
 *         <th style="border:0;width:25px;height:30px;background-color:rgb(80,91,30);margin:0"></th>
 *         <th style="border:0;width:25px;height:30px;background-color:rgb(98,107,32);margin:0"></th>
 *         <th style="border:0;width:25px;height:30px;background-color:rgb(119,121,34);margin:0"></th>
 *         <th style="border:0;width:25px;height:30px;background-color:rgb(137,139,35);margin:0"></th>
 *         <th style="border:0;width:25px;height:30px;background-color:rgb(157,159,40);margin:0"></th>
 *       </tr>
 *       <tr>
 *         <th style="border:0;">Deep Sea</th>
 *         <th style="border:0;width:25px;height:30px;background-color:rgb(31,108,107);margin:0"></th>
 *         <th style="border:0;width:25px;height:30px;background-color:rgb(32,128,106);margin:0"></th>
 *         <th style="border:0;width:25px;height:30px;background-color:rgb(70,152,112);margin:0"></th>
 *         <th style="border:0;width:25px;height:30px;background-color:rgb(117,180,122);margin:0"></th>
 *         <th style="border:0;width:25px;height:30px;background-color:rgb(140,196,123);margin:0"></th>
 *       </tr>
 *       <tr>
 *         <th style="border:0;">Fresh Wild Berries</th>
 *         <th style="border:0;width:25px;height:30px;background-color:rgb(72,63,80);margin:0"></th>
 *         <th style="border:0;width:25px;height:30px;background-color:rgb(102,77,110);margin:0"></th>
 *         <th style="border:0;width:25px;height:30px;background-color:rgb(127,85,131);margin:0"></th>
 *         <th style="border:0;width:25px;height:30px;background-color:rgb(151,94,149);margin:0"></th>
 *         <th style="border:0;width:25px;height:30px;background-color:rgb(171,98,156);margin:0"></th>
 *       </tr>
 *     </tbody>
 *   </table>
 * </div>
 *
 * @author Arctic Ice Studio &lt;development@arcticicestudio.com&gt;
 * @version 0.1.0
 * @since 0.1.0
 */
public enum Lumio {
  /**
   * Base component color "{@code lumio0}" of "Rough Coal" with a RGB value of {@code rgb(36, 28, 28)} and a HEX value
   * of {@code #241C1C}.
   * <p>
   *   The X11 color scheme name is "Dark Livid Wood".
   *   <div style="border:none;width:25px;height:25px;background-color:rgb(36,28,28);margin:0"></div>
   */
  LUMIO0(36, 28, 28),

  /**
   * Brighter color "{@code lumio1}" of the "Rough Coal" component base color {@link #LUMIO0} with a RGB value of
   * {@code rgb(50, 39,38)} and a HEX value of {@code #322726}.
   * <p>
   *   The X11 color scheme name is "Livid Wood".
   *   <div style="border:none;width:25px;height:25px;background-color:rgb(50,39,38);margin:0"></div>
   */
  LUMIO1(50, 39, 38),

  /**
   * Brighter color "{@code lumio2}" of the "Rough Coal" component base color {@link #LUMIO0} with a RGB value of
   * {@code rgb(68, 53, 51)} and a HEX value of {@code #443533}.
   * <p>
   *   The X11 color scheme name is "Cowboy".
   *   <div style="border:none;width:25px;height:25px;background-color:rgb(68,53,51);margin:0"></div>
   */
  LUMIO2(68, 53, 51),

  /**
   * Brighter color "{@code lumio3}" of the "Rough Coal" component base color {@link #LUMIO0} with a RGB value of
   * {@code rgb(106, 90, 78)} and a HEX value of {@code #6A5A4E}.
   * <p>
   *   The X11 color scheme name is "Kabul".
   *   <div style="border:none;width:25px;height:25px;background-color:rgb(106,90,78);margin:0"></div>
   */
  LUMIO3(106, 90, 78),

  /**
   * Brighter color "{@code lumio4}" of the "Rough Coal" component base color {@link #LUMIO0} with a RGB value of
   * {@code rgb(121, 106, 88)} and a HEX value of {@code #796A58}.
   * <p>
   *   The X11 color scheme name is "Pine Cone".
   *   <div style="border:none;width:25px;height:25px;background-color:rgb(121,106,88);margin:0"></div>
   */
  LUMIO4(121, 106, 88),

  /**
   * Base component color "{@code lumio5}" of "Soft Earth" with a RGB value of {@code rgb(70, 45, 36)} and a HEX
   * value of {@code #462D24}.
   * <p>
   *   The X11 color scheme name is "Morocco Brown".
   *   <div style="border:none;width:25px;height:25px;background-color:rgb(70,45,36);margin:0"></div>
   */
  LUMIO5(70, 45, 36),

  /**
   * Brighter color "{@code lumio6}" of the "Soft Earth" component base color {@link #LUMIO5} with a RGB value of
   * {@code rgb(82, 53, 42)} and a HEX value of {@code #52352A}.
   * <p>
   *   The X11 color scheme name is "Dark Oak".
   *   <div style="border:none;width:25px;height:25px;background-color:rgb(82,53,42);margin:0"></div>
   */
  LUMIO6(82, 53, 42),

  /**
   * Brighter color "{@code lumio7}" of the "Soft Earth" component base color {@link #LUMIO5} with a RGB value of
   * {@code rgb(93, 57, 42)} and a HEX value of {@code #5D392A}.
   * <p>
   *   The X11 color scheme name is "Cioccolato".
   *   <div style="border:none;width:25px;height:25px;background-color:rgb(93,57,42);margin:0"></div>
   */
  LUMIO7(93, 57, 42),

  /**
   * Brighter color "{@code lumio8}" of the "Soft Earth" component base color {@link #LUMIO5} with a RGB value of
   * {@code rgb(104, 64, 47)} and a HEX value of {@code #68402F}.
   * <p>
   *   The X11 color scheme name is "Old Copper".
   *   <div style="border:none;width:25px;height:25px;background-color:rgb(104,64,47);margin:0"></div>
   */
  LUMIO8(104, 64, 47),

  /**
   * Brighter color "{@code lumio9}" of the "Soft Earth" component base color {@link #LUMIO5} with a RGB value of
   * {@code rgb(122, 72, 48)} and a HEX value of {@code #7A4830}.
   * <p>
   *   The X11 color scheme name is "Bull Shot".
   *   <div style="border:none;width:25px;height:25px;background-color:rgb(122,72,48);margin:0"></div>
   */
  LUMIO9(122, 72, 48),

  /**
   * Brighter color "{@code lumio10}" of the "Soft Earth" component base color {@link #LUMIO5} with a RGB value of
   * {@code rgb(136, 87, 53)} and a HEX value of {@code #885735}.
   * <p>
   *   The X11 color scheme name is "Korma".
   *   <div style="border:none;width:25px;height:25px;background-color:rgb(136,87,53);margin:0"></div>
   */
  LUMIO10(136, 87, 53),

  /**
   * Brighter color "{@code lumio11}" of the "Soft Earth" component base color {@link #LUMIO5} with a RGB value of
   * {@code rgb(151, 101, 56)} and a HEX value of {@code #976538}.
   * <p>
   *   The X11 color scheme name is "Natural".
   *   <div style="border:none;width:25px;height:25px;background-color:rgb(151,101,56);margin:0"></div>
   */
  LUMIO11(151, 101, 56),

  /**
   * Brighter color "{@code lumio12}" of the "Soft Earth" component base color {@link #LUMIO5} with a RGB value of
   * {@code rgb(163, 116, 59)} and a HEX value of {@code #A3743B}.
   * <p>
   *   The X11 color scheme name is "Rusty Nail".
   *   <div style="border:none;width:25px;height:25px;background-color:rgb(163,116,59);margin:0"></div>
   */
  LUMIO12(163, 116, 59),

  /**
   * Brighter color "{@code lumio13}" of the "Soft Earth" component base color {@link #LUMIO5} with a RGB value of
   * {@code rgb(175, 135, 62)} and a HEX value of {@code #AF873E}.
   * <p>
   *   The X11 color scheme name is "Tussock".
   *   <div style="border:none;width:25px;height:25px;background-color:rgb(175,135,62);margin:0"></div>
   */
  LUMIO13(175, 135, 62),

  /**
   * Base component color "{@code lumio14}" of "Hard Metal" with a RGB value of {@code rgb(126, 98, 94)} and a HEX
   * value of {@code #7E625E}.
   * <p>
   *   The X11 color scheme name is "Pharlap".
   *   <div style="border:none;width:25px;height:25px;background-color:rgb(126,98,94);margin:0"></div>
   */
  LUMIO14(126, 98, 94),

  /**
   * Brighter color "{@code lumio15}" of the "Hard Metal" component base color {@link #LUMIO14} with a RGB value of
   * {@code rgb(140, 113, 104)} and a HEX value of {@code #AF873E}.
   * <p>
   *   The X11 color scheme name is "Dark Hemp".
   *   <div style="border:none;width:25px;height:25px;background-color:rgb(140,113,104);margin:0"></div>
   */
  LUMIO15(140, 113, 104),

  /**
   * Brighter color "{@code lumio16}" of the "Hard Metal" component base color {@link #LUMIO14} with a RGB value of
   * {@code rgb(157, 130, 117)} and a HEX value of {@code #9D8275}.
   * <p>
   *   The X11 color scheme name is "Hemp".
   *   <div style="border:none;width:25px;height:25px;background-color:rgb(157,130,117);margin:0"></div>
   */
  LUMIO16(157, 130, 117),

  /**
   * Brighter color "{@code lumio17}" of the "Hard Metal" component base color {@link #LUMIO14} with a RGB value of
   * {@code rgb(169, 145, 126)} and a HEX value of {@code #A9917E}.
   * <p>
   *   The X11 color scheme name is "Sandrift".
   *   <div style="border:none;width:25px;height:25px;background-color:rgb(169,145,126);margin:0"></div>
   */
  LUMIO17(169, 145, 126),

  /**
   * Base component color "{@code lumio18}" of "Piquant Olive" with a RGB value of {@code rgb(129, 123, 96)} and a HEX
   * value of {@code #817B60}.
   * <p>
   *   The X11 color scheme name is "Olive Haze".
   *   <div style="border:none;width:25px;height:25px;background-color:rgb(129,123,96);margin:0"></div>
   */
  LUMIO18(129, 123, 96),

  /**
   * Brighter color "{@code lumio19}" of the "Piquant Olive" component base color {@link #LUMIO18} with a RGB value of
   * {@code rgb(149, 142, 111)} and a HEX value of {@code #958E6F}.
   * <p>
   *   The X11 color scheme name is "Gurkha".
   *   <div style="border:none;width:25px;height:25px;background-color:rgb(149,142,111);margin:0"></div>
   */
  LUMIO19(149, 142, 111),

  /**
   * Brighter color "{@code lumio20}" of the "Piquant Olive" component base color {@link #LUMIO18} with a RGB value of
   * {@code rgb(169, 163, 126)} and a HEX value of {@code #A9A37E}.
   * <p>
   *   The X11 color scheme name is "Hillary".
   *   <div style="border:none;width:25px;height:25px;background-color:rgb(169,163,126);margin:0"></div>
   */
  LUMIO20(169, 163, 126),

  /**
   * Brighter color "{@code lumio21}" of the "Piquant Olive" component base color {@link #LUMIO18} with a RGB value of
   * {@code rgb(204, 201, 170)} and a HEX value of {@code #CCC9AA}.
   * <p>
   *   The X11 color scheme name is "White Rock".
   *   <div style="border:none;width:25px;height:25px;background-color:rgb(204,201,170);margin:0"></div>
   */
  LUMIO21(204, 201, 170),

  /**
   * Base component color "{@code lumio22}" of "Cold Snow" with a RGB value of {@code rgb(204, 175, 170)} and a HEX
   * value of {@code #CCAFAA}.
   * <p>
   *   The X11 color scheme name is "Oyster Pink".
   *   <div style="border:none;width:25px;height:25px;background-color:rgb(204,175,170);margin:0"></div>
   */
  LUMIO22(204, 175, 170),

  /**
   * Brighter color "{@code lumio23}" of the "Cold Snow" component base color {@link #LUMIO22} with a RGB value of
   * {@code rgb(216, 192, 182)} and a HEX value of {@code #D8C0B6}.
   * <p>
   *   The X11 color scheme name is "Wafer".
   *   <div style="border:none;width:25px;height:25px;background-color:rgb(216,192,182);margin:0"></div>
   */
  LUMIO23(216, 192, 182),

  /**
   * Brighter color "{@code lumio24}" of the "Cold Snow" component base color {@link #LUMIO22} with a RGB value of
   * {@code rgb(227, 208, 196)} and a HEX value of {@code #E3D0C4}.
   * <p>
   *   The X11 color scheme name is "Bizarre".
   *   <div style="border:none;width:25px;height:25px;background-color:rgb(227,208,196);margin:0"></div>
   */
  LUMIO24(227, 208, 196),

  /**
   * Brighter color "{@code lumio25}" of the "Cold Snow" component base color {@link #LUMIO22} with a RGB value of
   * {@code rgb(233, 219, 204)} and a HEX value of {@code #E9DBCC}.
   * <p>
   *   The X11 color scheme name is "Quarter Spanish White".
   *   <div style="border:none;width:25px;height:25px;background-color:rgb(233,219,204);margin:0"></div>
   */
  LUMIO25(233, 219, 204),

  /**
   * Base component color "{@code lumio26}" of "Clear Water" with a RGB value of {@code rgb(4, 89, 143)} and a HEX
   * value of {@code #04598F}.
   * <p>
   *   The X11 color scheme name is "Dark Lochmara".
   *   <div style="border:none;width:25px;height:25px;background-color:rgb(4,89,143);margin:0"></div>
   */
  LUMIO26(4, 89, 143),

  /**
   * Brighter color "{@code lumio27}" of the "Clear Water" component base color {@link #LUMIO26} with a RGB value of
   * {@code rgb(4, 99, 151)} and a HEX value of {@code #046397}.
   * <p>
   *   The X11 color scheme name is "Lochmara".
   *   <div style="border:none;width:25px;height:25px;background-color:rgb(4,99,151);margin:0"></div>
   */
  LUMIO27(4, 99, 151),

  /**
   * Brighter color "{@code lumio28}" of the "Clear Water" component base color {@link #LUMIO26} with a RGB value of
   * {@code rgb(4, 108, 165)} and a HEX value of {@code #046CA5}.
   * <p>
   *   The X11 color scheme name is "Curious Blue".
   *   <div style="border:none;width:25px;height:25px;background-color:rgb(4,108,165);margin:0"></div>
   */
  LUMIO28(4, 108, 165),

  /**
   * Brighter color "{@code lumio29}" of the "Clear Water" component base color {@link #LUMIO26} with a RGB value of
   * {@code rgb(4, 128, 164)} and a HEX value of {@code #0480A4}.
   * <p>
   *   The X11 color scheme name is "Boston Blue".
   *   <div style="border:none;width:25px;height:25px;background-color:rgb(4,128,164);margin:0"></div>
   */
  LUMIO29(4, 128, 164),

  /**
   * Brighter color "{@code lumio30}" of the "Clear Water" component base color {@link #LUMIO26} with a RGB value of
   * {@code rgb(19, 152, 169)} and a HEX value of {@code #1398A9}.
   * <p>
   *   The X11 color scheme name is "Viking".
   *   <div style="border:none;width:25px;height:25px;background-color:rgb(19,152,169);margin:0"></div>
   */
  LUMIO30(19, 152, 169),

  /**
   * Brighter color "{@code lumio31}" of the "Clear Water" component base color {@link #LUMIO26} with a RGB value of
   * {@code rgb(38, 164, 173)} and a HEX value of {@code #26A4AD}.
   * <p>
   *   The X11 color scheme name is "Java".
   *   <div style="border:none;width:25px;height:25px;background-color:rgb(38,164,173);margin:0"></div>
   */
  LUMIO31(38, 164, 173),

  /**
   * Brighter color "{@code lumio32}" of the "Clear Water" component base color {@link #LUMIO26} with a RGB value of
   * {@code rgb(54, 180, 176)} and a HEX value of {@code #36B4B0}.
   * <p>
   *   The X11 color scheme name is "Sea Green".
   *   <div style="border:none;width:25px;height:25px;background-color:rgb(54,180,176);margin:0"></div>
   */
  LUMIO32(54, 180, 176),

  /**
   * Brighter color "{@code lumio33}" of the "Clear Water" component base color {@link #LUMIO26} with a RGB value of
   * {@code rgb(77, 196, 177)} and a HEX value of {@code #4DC4B1}.
   * <p>
   *   The X11 color scheme name is "Light Sea Green".
   *   <div style="border:none;width:25px;height:25px;background-color:rgb(77,196,177);margin:0"></div>
   */
  LUMIO33(77, 196, 177),

  /**
   * Brighter color "{@code lumio34}" of the "Clear Water" component base color {@link #LUMIO26} with a RGB value of
   * {@code rgb(84, 222, 178)} and a HEX value of {@code #54DEB2}.
   * <p>
   *   The X11 color scheme name is "Aquamarine".
   *   <div style="border:none;width:25px;height:25px;background-color:rgb(84,222,178);margin:0"></div>
   */
  LUMIO34(84, 222, 178),

  /**
   * Base component color "{@code lumio35}" of "Hot Flame" with a RGB value of {@code rgb(85, 58, 71)} and a HEX
   * value of {@code #553A47}.
   * <p>
   *   The X11 color scheme name is "Barossa".
   *   <div style="border:none;width:25px;height:25px;background-color:rgb(85,58,71);margin:0"></div>
   */
  LUMIO35(85, 58, 71),

  /**
   * Brighter color "{@code lumio36}" of the "Hot Flame" component base color {@link #LUMIO35} with a RGB value of
   * {@code rgb(120, 68, 82)} and a HEX value of {@code #784452}.
   * <p>
   *   The X11 color scheme name is "Black Rose".
   *   <div style="border:none;width:25px;height:25px;background-color:rgb(120,68,82);margin:0"></div>
   */
  LUMIO36(120, 68, 82),

  /**
   * Brighter color "{@code lumio37}" of the "Hot Flame" component base color {@link #LUMIO35} with a RGB value of
   * {@code rgb(144, 72, 81)} and a HEX value of {@code #904851}.
   * <p>
   *   The X11 color scheme name is "Merlot".
   *   <div style="border:none;width:25px;height:25px;background-color:rgb(144,72,81);margin:0"></div>
   */
  LUMIO37(144, 72, 81),

  /**
   * Brighter color "{@code lumio38}" of the "Hot Flame" component base color {@link #LUMIO35} with a RGB value of
   * {@code rgb(168, 78, 78)} and a HEX value of {@code #A84E4E}.
   * <p>
   *   The X11 color scheme name is "Roof Terracotta".
   *   <div style="border:none;width:25px;height:25px;background-color:rgb(168,78,78);margin:0"></div>
   */
  LUMIO38(168, 78, 78),

  /**
   * Brighter color "{@code lumio39}" of the "Hot Flame" component base color {@link #LUMIO35} with a RGB value of
   * {@code rgb(193, 96, 77)} and a HEX value of {@code #C1604D}.
   * <p>
   *   The X11 color scheme name is "Flame Pea".
   *   <div style="border:none;width:25px;height:25px;background-color:rgb(193,96,77);margin:0"></div>
   */
  LUMIO39(193, 96, 77),

  /**
   * Brighter color "{@code lumio40}" of the "Hot Flame" component base color {@link #LUMIO35} with a RGB value of
   * {@code rgb(212, 112, 85)} and a HEX value of {@code #D47055}.
   * <p>
   *   The X11 color scheme name is "Japonica".
   *   <div style="border:none;width:25px;height:25px;background-color:rgb(212,112,85);margin:0"></div>
   */
  LUMIO40(212, 112, 85),

  /**
   * Base component color "{@code lumio41}" of "Roasted Cocoa Bean" with a RGB value of {@code rgb(89, 49, 59)} and a
   * HEX value of {@code #59313B}.
   * <p>
   *   The X11 color scheme name is "Wine Berry".
   *   <div style="border:none;width:25px;height:25px;background-color:rgb(89,49,59);margin:0"></div>
   */
  LUMIO41(89, 49, 59),

  /**
   * Brighter color "{@code lumio42}" of the "Roasted Cocoa Bean" component base color {@link #LUMIO41} with a RGB
   * value of {@code rgb(111, 57, 58)} and a HEX value of {@code #6F393A}.
   * <p>
   *   The X11 color scheme name is "Sanguine Brown".
   *   <div style="border:none;width:25px;height:25px;background-color:rgb(111,57,58);margin:0"></div>
   */
  LUMIO42(111, 57, 58),

  /**
   * Brighter color "{@code lumio43}" of the "Roasted Cocoa Bean" component base color {@link #LUMIO41} with a RGB
   * value of {@code rgb(128, 72, 61)} and a HEX value of {@code #80483D}.
   * <p>
   *   The X11 color scheme name is "Nutmeg".
   *   <div style="border:none;width:25px;height:25px;background-color:rgb(128,72,61);margin:0"></div>
   */
  LUMIO43(128, 72, 61),

  /**
   * Brighter color "{@code lumio44}" of the "Roasted Cocoa Bean" component base color {@link #LUMIO41} with a RGB
   * value of {@code rgb(147, 87, 63)} and a HEX value of {@code #93573F}.
   * <p>
   *   The X11 color scheme name is "Paarl".
   *   <div style="border:none;width:25px;height:25px;background-color:rgb(147,87,63);margin:0"></div>
   */
  LUMIO44(147, 87, 63),

  /**
   * Brighter color "{@code lumio45}" of the "Roasted Cocoa Bean" component base color {@link #LUMIO41} with a RGB
   * value of {@code rgb(163, 106, 65)} and a HEX value of {@code #A36A41}.
   * <p>
   *   The X11 color scheme name is "Red Beech".
   *   <div style="border:none;width:25px;height:25px;background-color:rgb(163,106,65);margin:0"></div>
   */
  LUMIO45(163, 106, 65),

  /**
   * Brighter color "{@code lumio46}" of the "Roasted Cocoa Bean" component base color {@link #LUMIO41} with a RGB
   * value of {@code rgb(178, 129, 66)} and a HEX value of {@code #B28142}.
   * <p>
   *   The X11 color scheme name is "Dirty Twine".
   *   <div style="border:none;width:25px;height:25px;background-color:rgb(178,129,66);margin:0"></div>
   */
  LUMIO46(178, 129, 66),

  /**
   * Base component color "{@code lumio47}" of "Tropical Wood" with a RGB value of {@code rgb(132, 60, 53)} and a HEX
   * value of {@code #843C35}.
   * <p>
   *   The X11 color scheme name is "Lusty".
   *   <div style="border:none;width:25px;height:25px;background-color:rgb(132,60,53);margin:0"></div>
   */
  LUMIO47(132, 60, 53),

  /**
   * Brighter color "{@code lumio48}" of the "Tropical Wood" component base color {@link #LUMIO47} with a RGB value
   * of {@code rgb(156, 76, 61)} and a HEX value of {@code #9C4C3D}.
   * <p>
   *   The X11 color scheme name is "Mojo".
   *   <div style="border:none;width:25px;height:25px;background-color:rgb(156,76,61);margin:0"></div>
   */
  LUMIO48(156, 76, 61),

  /**
   * Brighter color "{@code lumio49}" of the "Tropical Wood" component base color {@link #LUMIO47} with a RGB value
   * of {@code rgb(173, 97, 67)} and a HEX value of {@code #AD6143}.
   * <p>
   *   The X11 color scheme name is "Tuscany".
   *   <div style="border:none;width:25px;height:25px;background-color:rgb(173,97,67);margin:0"></div>
   */
  LUMIO49(173, 97, 67),

  /**
   * Brighter color "{@code lumio50}" of the "Tropical Wood" component base color {@link #LUMIO47} with a RGB value
   * of {@code rgb(186, 120, 69)} and a HEX value of {@code #BA7845}.
   * <p>
   *   The X11 color scheme name is "Bourbon".
   *   <div style="border:none;width:25px;height:25px;background-color:rgb(186,120,69);margin:0"></div>
   */
  LUMIO50(186, 120, 69),

  /**
   * Brighter color "{@code lumio51}" of the "Tropical Wood" component base color {@link #LUMIO47} with a RGB value
   * of {@code rgb(201, 145, 71)} and a HEX value of {@code #C99147}.
   * <p>
   *   The X11 color scheme name is "Anzac".
   *   <div style="border:none;width:25px;height:25px;background-color:rgb(201,145,71);margin:0"></div>
   */
  LUMIO51(201, 145, 71),

  /**
   * Base component color "{@code lumio52}" of "Fine Sand" with a RGB value of {@code rgb(162, 104, 70)} and a HEX
   * value of {@code #843C35}.
   * <p>
   *   The X11 color scheme name is "Rope".
   *   <div style="border:none;width:25px;height:25px;background-color:rgb(162,104,70);margin:0"></div>
   */
  LUMIO52(162, 104, 70),

  /**
   * Brighter color "{@code lumio53}" of the "Fine Sand" component base color {@link #LUMIO52} with a RGB value of
   * {@code rgb(182, 125, 79)} and a HEX value of {@code #B67D4F}.
   * <p>
   *   The X11 color scheme name is "Whiskey".
   *   <div style="border:none;width:25px;height:25px;background-color:rgb(182,125,79);margin:0"></div>
   */
  LUMIO53(182, 125, 79),

  /**
   * Brighter color "{@code lumio54}" of the "Fine Sand" component base color {@link #LUMIO52} with a RGB value of
   * {@code rgb(191, 137, 83)} and a HEX value of {@code #BF8953}.
   * <p>
   *   The X11 color scheme name is "Dark Twine".
   *   <div style="border:none;width:25px;height:25px;background-color:rgb(191,137,83);margin:0"></div>
   */
  LUMIO54(191, 137, 83),

  /**
   * Brighter color "{@code lumio55}" of the "Fine Sand" component base color {@link #LUMIO52} with a RGB value of
   * {@code rgb(197, 151, 89)} and a HEX value of {@code #C59759}.
   * <p>
   *   The X11 color scheme name is "Twine".
   *   <div style="border:none;width:25px;height:25px;background-color:rgb(197,151,89);margin:0"></div>
   */
  LUMIO55(197, 151, 89),

  /**
   * Brighter color "{@code lumio56}" of the "Fine Sand" component base color {@link #LUMIO52} with a RGB value of
   * {@code rgb(203, 166, 91)} and a HEX value of {@code #CBA65B}.
   * <p>
   *   The X11 color scheme name is "Apache".
   *   <div style="border:none;width:25px;height:25px;background-color:rgb(203,166,91);margin:0"></div>
   */
  LUMIO56(203, 166, 91),


  /**
   * Base component color "{@code lumio57}" of "Sweet Banana" with a RGB value of {@code rgb(148, 95, 60)} and a
   * HEX value of {@code #945F3C}.
   * <p>
   *   The X11 color scheme name is "Dark Rope".
   *   <div style="border:none;width:25px;height:25px;background-color:rgb(148,95,60);margin:0"></div>
   */
  LUMIO57(148, 95, 60),

  /**
   * Brighter color "{@code lumio58}" of the "Sweet Banana" component base color {@link #LUMIO57} with a RGB value of
   * {@code rgb(178, 129, 66)} and a HEX value of {@code #B28142}.
   * <p>
   *   The X11 color scheme name is "Rusty Twine".
   *   <div style="border:none;width:25px;height:25px;background-color:rgb(178,129,66);margin:0"></div>
   */
  LUMIO58(178, 129, 66),

  /**
   * Brighter color "{@code lumio59}" of the "Sweet Banana" component base color {@link #LUMIO57} with a RGB value of
   * {@code rgb(205, 165, 68)} and a HEX value of {@code #CDA544}.
   * <p>
   *   The X11 color scheme name is "Hokey Pokey".
   *   <div style="border:none;width:25px;height:25px;background-color:rgb(205,165,68);margin:0"></div>
   */
  LUMIO59(205, 165, 68),

  /**
   * Brighter color "{@code lumio60}" of the "Sweet Banana" component base color {@link #LUMIO57} with a RGB value of
   * {@code rgb(236, 207, 73)} and a HEX value of {@code #ECCF49}.
   * <p>
   *   The X11 color scheme name is "Portica".
   *   <div style="border:none;width:25px;height:25px;background-color:rgb(236,207,73);margin:0"></div>
   */
  LUMIO60(236, 207, 73),

  /**
   * Base component color "{@code lumio61}" of "Calm Sunset" with a RGB value of {@code rgb(141, 73, 43)} and a HEX
   * value of {@code #8D492B}.
   * <p>
   *   The X11 color scheme name is "Alert Tan".
   *   <div style="border:none;width:25px;height:25px;background-color:rgb(141,73,43);margin:0"></div>
   */
  LUMIO61(141, 73, 43),

  /**
   * Brighter color "{@code lumio62}" of the "Calm Sunset" component base color {@link #LUMIO61} with a RGB value of
   * {@code rgb(156, 82, 47)} and a HEX value of {@code #9C522F}.
   * <p>
   *   The X11 color scheme name is "Piper".
   *   <div style="border:none;width:25px;height:25px;background-color:rgb(156,82,47);margin:0"></div>
   */
  LUMIO62(156, 82, 47),

  /**
   * Brighter color "{@code lumio63}" of the "Calm Sunset" component base color {@link #LUMIO61} with a RGB value of
   * {@code rgb(173, 94, 51)} and a HEX value of {@code #AD5E33}.
   * <p>
   *   The X11 color scheme name is "Rich Gold".
   *   <div style="border:none;width:25px;height:25px;background-color:rgb(173,94,51);margin:0"></div>
   */
  LUMIO63(173, 94, 51),

  /**
   * Brighter color "{@code lumio64}" of the "Calm Sunset" component base color {@link #LUMIO61} with a RGB value of
   * {@code rgb(191, 107, 62)} and a HEX value of {@code #BF6B3E}.
   * <p>
   *   The X11 color scheme name is "Bamboo".
   *   <div style="border:none;width:25px;height:25px;background-color:rgb(191,107,62);margin:0"></div>
   */
  LUMIO64(191, 107, 62),

  /**
   * Brighter color "{@code lumio65}" of the "Calm Sunset" component base color {@link #LUMIO61} with a RGB value of
   * {@code rgb(207, 123, 67)} and a HEX value of {@code #CF7B43}.
   * <p>
   *   The X11 color scheme name is "Zest".
   *   <div style="border:none;width:25px;height:25px;background-color:rgb(207,123,67);margin:0"></div>
   */
  LUMIO65(207, 123, 67),

  /**
   * Base component color "{@code lumio66}" of "Living Forest" with a RGB value of {@code rgb(80, 91, 30)} and a HEX
   * value of {@code #505B1E}.
   * <p>
   *   The X11 color scheme name is "Verdun Green".
   *   <div style="border:none;width:25px;height:25px;background-color:rgb(80,91,30);margin:0"></div>
   */
  LUMIO66(80, 91, 30),

  /**
   * Brighter color "{@code lumio67}" of the "Living Forest" component base color {@link #LUMIO66} with a RGB value of
   * {@code rgb(98, 107, 32)} and a HEX value of {@code #626B20}.
   * <p>
   *   The X11 color scheme name is "Rain Forest".
   *   <div style="border:none;width:25px;height:25px;background-color:rgb(98,107,32);margin:0"></div>
   */
  LUMIO67(98, 107, 32),

  /**
   * Brighter color "{@code lumio68}" of the "Living Forest" component base color {@link #LUMIO66} with a RGB value of
   * {@code rgb(119, 121, 34)} and a HEX value of {@code #777922}.
   * <p>
   *   The X11 color scheme name is "Dark Trendy Green".
   *   <div style="border:none;width:25px;height:25px;background-color:rgb(119,121,34);margin:0"></div>
   */
  LUMIO68(119, 121, 34),

  /**
   * Brighter color "{@code lumio69}" of the "Living Forest" component base color {@link #LUMIO66} with a RGB value of
   * {@code rgb(137, 139, 35)} and a HEX value of {@code #898B23}.
   * <p>
   *   The X11 color scheme name is "Trendy Green".
   *   <div style="border:none;width:25px;height:25px;background-color:rgb(137,139,35);margin:0"></div>
   */
  LUMIO69(137, 139, 35),

  /**
   * Brighter color "{@code lumio70}" of the "Living Forest" component base color {@link #LUMIO66} with a RGB value of
   * {@code rgb(157, 159, 40)} and a HEX value of {@code #9D9F28}.
   * <p>
   *   The X11 color scheme name is "Citron".
   *   <div style="border:none;width:25px;height:25px;background-color:rgb(157,159,40);margin:0"></div>
   */
  LUMIO70(157, 159, 40),

  /**
   * Base component color "{@code lumio71}" of "Deep Sea" with a RGB value of {@code rgb(31, 108, 107)} and a HEX
   * value of {@code #1F6C6B}.
   * <p>
   *   The X11 color scheme name is "Blue Stone".
   *   <div style="border:none;width:25px;height:25px;background-color:rgb(31,108,107);margin:0"></div>
   */
  LUMIO71(31, 108, 107),

  /**
   * Brighter color "{@code lumio72}" of the "Deep Sea" component base color {@link #LUMIO71} with a RGB value of
   * {@code rgb(32, 128, 106)} and a HEX value of {@code #20806A}.
   * <p>
   *   The X11 color scheme name is "Deep Sea".
   *   <div style="border:none;width:25px;height:25px;background-color:rgb(32,128,106);margin:0"></div>
   */
  LUMIO72(32, 128, 106),

  /**
   * Brighter color "{@code lumio73}" of the "Deep Sea" component base color {@link #LUMIO71} with a RGB value of
   * {@code rgb(70, 152, 112)} and a HEX value of {@code #469870}.
   * <p>
   *   The X11 color scheme name is "Amazon".
   *   <div style="border:none;width:25px;height:25px;background-color:rgb(70,152,112);margin:0"></div>
   */
  LUMIO73(70, 152, 112),

  /**
   * Brighter color "{@code lumio74}" of the "Deep Sea" component base color {@link #LUMIO71} with a RGB value of
   * {@code rgb(117, 180, 122)} and a HEX value of {@code #75B47A}.
   * <p>
   *   The X11 color scheme name is "De York".
   *   <div style="border:none;width:25px;height:25px;background-color:rgb(117,180,122);margin:0"></div>
   */
  LUMIO74(117, 180, 122),

  /**
   * Brighter color "{@code lumio75}" of the "Deep Sea" component base color {@link #LUMIO71} with a RGB value of
   * {@code rgb(140, 196, 123)} and a HEX value of {@code #8CC47B}.
   * <p>
   *   The X11 color scheme name is "Gossip".
   *   <div style="border:none;width:25px;height:25px;background-color:rgb(140,196,123);margin:0"></div>
   */
  LUMIO75(140, 196, 123),

  /**
   * Base component color "{@code lumio76}" of "Fresh Wild Berries" with a RGB value of {@code rgb(72, 63, 80)} and a
   * HEX value of {@code #483F50}.
   * <p>
   *   The X11 color scheme name is "Martinique".
   *   <div style="border:none;width:25px;height:25px;background-color:rgb(72,63,80);margin:0"></div>
   */
  LUMIO76(72, 63, 80),

  /**
   * Brighter color "{@code lumio77}" of the "Fresh Wild Berries" component base color {@link #LUMIO76} with a RGB value
   * of {@code rgb(102, 77, 110)} and a HEX value of {@code #664D6E}.
   * <p>
   *   The X11 color scheme name is "Trendy Pink".
   *   <div style="border:none;width:25px;height:25px;background-color:rgb(102,77,110);margin:0"></div>
   */
  LUMIO77(102, 77, 110),

  /**
   * Brighter color "{@code lumio78}" of the "Fresh Wild Berries" component base color {@link #LUMIO76} with a RGB
   * value of {@code rgb(127, 85, 131)} and a HEX value of {@code #7F5583}.
   * <p>
   *   The X11 color scheme name is "Affair".
   *   <div style="border:none;width:25px;height:25px;background-color:rgb(127,85,131);margin:0"></div>
   */
  LUMIO78(127, 85, 131),

  /**
   * Brighter color "{@code lumio79}" of the "Fresh Wild Berries" component base color {@link #LUMIO76} with a RGB
   * value of {@code rgb(151, 94, 149)} and a HEX value of {@code #975E95}.
   * <p>
   *   The X11 color scheme name is "Eminence".
   *   <div style="border:none;width:25px;height:25px;background-color:rgb(151,94,149);margin:0"></div>
   */
  LUMIO79(151, 94, 149),

  /**
   * Brighter color "{@code lumio80}" of the "Fresh Wild Berries" component base color {@link #LUMIO76} with a RGB
   * value of {@code rgb(171, 98, 156)} and a HEX value of {@code #AB629C}.
   * <p>
   *   The X11 color scheme name is "Plum".
   *   <div style="border:none;width:25px;height:25px;background-color:rgb(171,98,156);margin:0"></div>
   */
  LUMIO80(171, 98, 156);

  /**
   * Prefix pattern to convert RGB- and HEX color values.
   */
  private static final Pattern COLOR_PREFIX = Pattern.compile("0x", Pattern.LITERAL);

  /**
   * The RGB color code.
   */
  private final Color COLOR;

  /**
   * Constructs a new color object.
   *
   * @param RED the value for the additive primary color {@code red}
   * @param GREEN the value for the additive primary color {@code green}
   * @param BLUE the value for the additive primary color {@code blue}
   */
  Lumio(final int RED, final int GREEN, final int BLUE) {
    COLOR = Color.rgb(RED, GREEN, BLUE);
  }

  /**
   * Converts the specified color to the RGB identifier.
   *
   * @param COLOR the color object to convert
   * @return a string representation of the RGB identifier
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
   * Converts the specified color to the HEX identifier.
   *
   * @param COLOR the color object to convert
   * @return a string representation of the HEX identifier
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
