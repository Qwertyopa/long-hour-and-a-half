/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package omo;

import java.io.Serializable;
import omo.ALongHourAndAHalf.GameStage;
import omo.ALongHourAndAHalf.Gender;

/**
 *
 * @author JavaBird
 */
class Save implements Serializable
{
    private static final long serialVersionUID = 1L;
    
    String name; //Already has been given to the constructor
    boolean hardcore; //Already has been given to the constructor
    Gender gender; //Already has been given to the constructor
    short bladder; //Already has been given to the constructor
    float incontinence; //Already has been given to the constructor
    short belly; //Already has been given to the constructor
    short embarassment;
    float dryness;
    short maxSphincterPower;
    short sphincterPower;
    Wear underwear;
    Wear outerwear;
    byte time;
    GameStage stage;
    int score;
    String scoreText;
    byte timesPeeDenied;
    byte timesCaught;
    short classmatesAwareness;
    boolean stay;
    boolean cornered;
    boolean drain;
    boolean cheatsUsed;
    String boyName;
}
