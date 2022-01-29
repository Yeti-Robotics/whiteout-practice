// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.subsystems;


import com.ctre.phoenix.motorcontrol.can.VictorSPX;
import com.ctre.phoenix.motorcontrol.can.VictorSPXConfiguration;
import com.ctre.phoenix.motorcontrol.can.WPI_VictorSPX;

import edu.wpi.first.wpilibj.DoubleSolenoid;
import edu.wpi.first.wpilibj.PneumaticsModuleType;
import edu.wpi.first.wpilibj.DoubleSolenoid.Value;
import edu.wpi.first.wpilibj2.command.SubsystemBase;

public class IntakeSubsystem extends SubsystemBase {
  private DoubleSolenoid roller;
  private WPI_VictorSPX victorSPX;
  public IntakeSubsystem() {
    victorSPX = new WPI_VictorSPX(5);
    roller = new DoubleSolenoid(PneumaticsModuleType.CTREPCM, 0, 1);
  }
    
public void extendRoller(){
  roller.set(Value.kForward);
}

public void retractRoller(){
  roller.set(Value.kReverse);
}
  @Override
  public void periodic() {
    // This method will be called once per scheduler run
  }
}
