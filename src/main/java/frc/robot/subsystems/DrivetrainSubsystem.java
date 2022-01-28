// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.subsystems;

import java.util.ResourceBundle.Control;

import com.ctre.phoenix.motorcontrol.ControlMode;
import com.ctre.phoenix.motorcontrol.can.WPI_TalonFX;


import edu.wpi.first.wpilibj.drive.DifferentialDrive;
import edu.wpi.first.wpilibj2.command.SubsystemBase;



public class DrivetrainSubsystem extends SubsystemBase {
  
  public DifferentialDrive u_drive;
  
  private WPI_TalonFX leftTalon1, leftTalon2, rightTalon1, rightTalon2;
  public DrivetrainSubsystem() {
    leftTalon1 = new WPI_TalonFX(5);
    leftTalon2 = new WPI_TalonFX(5);
    rightTalon1 = new WPI_TalonFX(5);
    rightTalon2 = new WPI_TalonFX(5);
    leftTalon2.follow(leftTalon1);
    rightTalon2.follow(rightTalon1);

    u_drive = new DifferentialDrive(leftTalon1, rightTalon1);
    u_drive.setDeadband(0.05);


  }

  public void drive(double rightSpeed , double leftSpeed) {
    leftTalon1.set(ControlMode.PercentOutput, leftSpeed);
    rightTalon1.set(ControlMode.PercentOutput, rightSpeed);
  }

  public void stop(){
    leftTalon1.set(ControlMode.PercentOutput, 0);
    rightTalon1.set(ControlMode.PercentOutput, 0);
  }
  @Override
  public void periodic() {

  }
}
