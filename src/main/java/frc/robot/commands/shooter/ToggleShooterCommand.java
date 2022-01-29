package frc.robot.commands.shooter;

import edu.wpi.first.wpilibj2.command.CommandBase;
import frc.robot.subsystems.ShooterSubsystem;
import frc.robot.subsystems.ShooterSubsystem.ShooterStatus;

public class ToggleShooterCommand extends CommandBase {
    private final ShooterSubsystem shooterSubsystem;

    public ToggleShooterCommand(ShooterSubsystem shooterSubsystem) {
        this.shooterSubsystem = shooterSubsystem;
        addRequirements(shooterSubsystem);
    }

    public void execute() {
        if (shooterSubsystem.getShooterStatus() == shooterSubsystem.shooterStatus.OFF) {
            shooterSubsystem.shootFlywheel(0.9);
        }
        else if (shooterSubsystem.getShooterStatus() == shooterSubsystem.shooterStatus.FORWARD) {
            shooterSubsystem.stopShoot();
        }
        else {
            shooterSubsystem.stopShoot();
        }
    }

    public boolean isFinished() {
        return true;
    }
}
