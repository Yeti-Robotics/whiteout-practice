// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.subsystems;

import com.ctre.phoenix.motorcontrol.ControlMode;
import com.ctre.phoenix.motorcontrol.can.VictorSPX;
import com.revrobotics.SparkMaxLimitSwitch;
import com.revrobotics.SparkMaxLimitSwitch.Type;

import edu.wpi.first.wpilibj.DigitalInput;
import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.Constants;

public class NeckSubsystem extends SubsystemBase {
  private VictorSPX victor1;
  private VictorSPX victor2;
  private DigitalInput neckbeambreak;
  /** Creates a new Neck. */
  public NeckSubsystem() {
    victor1 = new VictorSPX(1);
    victor2 = new VictorSPX(1);
    neckbeambreak = new DigitalInput(1);
  }

  public void neckUp(){
    victor1.set(ControlMode.PercentOutput, Constants.NECK_UP_SPEED);
    victor2.set(ControlMode.PercentOutput, Constants.NECK_UP_SPEED);
  }
  public void neckDown(){
    victor1.set(ControlMode.PercentOutput, Constants.NECK_DOWN_SPEED);
    victor2.set(ControlMode.PercentOutput, Constants.NECK_DOWN_SPEED);
  }
  public void neckStop(){
    victor1.set(ControlMode.PercentOutput, 0);
    victor2.set(ControlMode.PercentOutput, 0);
  }

  public boolean getBeamBreak(){
    return neckbeambreak.get();
  }

  @Override
  public void periodic() {
    // This method will be called once per scheduler run
  }
}
