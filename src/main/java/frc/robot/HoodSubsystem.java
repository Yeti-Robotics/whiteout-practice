// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot;

import com.revrobotics.CANSparkMax;
import com.revrobotics.RelativeEncoder;
import com.revrobotics.SparkMaxLimitSwitch;
import com.revrobotics.CANSparkMaxLowLevel.MotorType;
import com.revrobotics.SparkMaxLimitSwitch.Type;

import edu.wpi.first.wpilibj2.command.SubsystemBase;

public class HoodSubsystem extends SubsystemBase {
  private CANSparkMax sparkMax;
  private RelativeEncoder encoder;
  private SparkMaxLimitSwitch beamBreak; 
  /** Creates a new Hood. */
  public HoodSubsystem() {
    sparkMax = new CANSparkMax(1, MotorType.kBrushless);
    encoder = sparkMax.getEncoder();
    beamBreak = sparkMax.getForwardLimitSwitch(Type.kNormallyOpen);
      
 }
 public void movehood(double power){
   sparkMax.set(power);
 }
 public void stophood(double power){
   sparkMax.set(0);
 }
 public double hoodAngleFromEncoder(double encoderValue){
  return encoderValue / Constants.COUNTS_PER_DEGREE;
}

public void resetEncoder(){
  encoder.setPosition(0);
}

public double getEncoder(){
  return encoder.getPosition();
}                                
public double calcHoodAngle(double distance) {
  return ((.0867898 * distance) + 12.4589);
}

 }


  
