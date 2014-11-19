/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package org.flamingmonkeys.lib;

/**
 *
 * @author Lons_DJ
 */
public class Utils {
    public static double deadband(double setVal, double deadband){
        return (Math.abs(setVal)<deadband)? 0.0 : setVal;
    }
    
}
