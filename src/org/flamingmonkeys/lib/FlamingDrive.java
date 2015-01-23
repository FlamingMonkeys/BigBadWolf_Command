/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package org.flamingmonkeys.lib;
//In memory of Mrs.DeWall
import edu.wpi.first.wpilibj.RobotDrive;
import edu.wpi.first.wpilibj.SpeedController;
import edu.wpi.first.wpilibj.DoubleSolenoid;
/**
 *
 * @author Lons_DJ
 */
public class FlamingDrive extends RobotDrive {
    private DoubleSolenoid shifter;

    public FlamingDrive(SpeedController leftMotor, SpeedController rightMotor, DoubleSolenoid shifter) {
        super(leftMotor, rightMotor);
        this.shifter = shifter;
    }
    
    
}
