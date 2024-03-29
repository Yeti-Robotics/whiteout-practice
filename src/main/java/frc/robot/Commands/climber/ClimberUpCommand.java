// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.commands.climber;

import edu.wpi.first.wpilibj2.command.CommandBase;
import frc.robot.Constants;
import frc.robot.subsystems.Climber;

public class ClimberUpCommand extends CommandBase {
  /** Creates a new ClimberUpCommand. */
  private Climber climber;
  public ClimberUpCommand(Climber climber) {
    // Use addRequirements() here to declare subsystem dependencies.
    this.climber = climber;
    addRequirements(climber);
  }

  // Called when the command is initially scheduled.
  @Override
  public void initialize() {}

  // Called every time the scheduler runs while the command is scheduled.
  @Override
  public void execute() {
  climber.climbDown(); }
  // Called once the command ends or is interrupted.
  @Override
  public void end(boolean interrupted) {
  climber.stopClimb(); }
  // Returns true when the command should end.
  @Override
  public boolean isFinished() {
    return climber.getAverageEncoder() <= Constants.CLIMBER_TOLERANCE;
  }
}
