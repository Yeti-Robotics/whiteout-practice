// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.commands;

import edu.wpi.first.wpilibj2.command.CommandBase;
import frc.robot.Constants;
import frc.robot.subsystems.HoodSubsystem;

public class HoodInCommand extends CommandBase {
  private HoodSubsystem hoodSubsystem; 
  
  /** Creates a new HoodIn. */
  public HoodInCommand(HoodSubsystem hoodSubsystem) {
    this.hoodSubsystem = new HoodSubsystem();
    addRequirements(hoodSubsystem);
  }

  // Called when the command is initially scheduled.
 
  // Called every time the scheduler runs while the command is scheduled.
  @Override
  public void execute() {
    if(!(hoodSubsystem.getEncoder() -Constants.HOOD_ANGLE_TOLERANCE >= Constants.MAX_HOOD_ANGLE)){
      hoodSubsystem.movehood(Constants.HOOD_SPEED);
    }
  }

  // Called once the command ends or is interrupted.
  @Override
  public void end(boolean interrupted) {}

  // Returns true when the command should end.
  @Override
  public boolean isFinished() {
    return false;
  }
}
