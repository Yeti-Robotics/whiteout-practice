// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.subsystems;

import com.ctre.phoenix.motorcontrol.can.TalonFX;
import com.ctre.phoenix.motorcontrol.can.VictorSPX;
import com.ctre.phoenix.motorcontrol.can.WPI_VictorSPX;

import edu.wpi.first.wpilibj2.command.SubsystemBase;

public class HopperSubsystem extends SubsystemBase {
  /** Creates a new HopperSubsystem. */
  
  
  private WPI_VictorSPX hopperVictorSPX;
  
  public HopperSubsystem() {

    hopperVictorSPX = new WPI_VictorSPX(1);
  }

public void hopperIn() {

hopperVictorSPX.set(.7);

}

public void hopperOut() {

hopperVictorSPX.set(-.7);

}

public void hopperStop() {

hopperVictorSPX.set(0);

}

  @Override
  public void periodic() {
    // This method will be called once per scheduler run
  }
}
