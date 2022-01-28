package frc.robot.commands.shooter;

import edu.wpi.first.wpilibj2.command.CommandBase;
import frc.robot.Constants.ShooterConstants;
import frc.robot.subsystems.ShooterSubsystem;

public class StartSpinCommand extends CommandBase {
    
    private final ShooterSubsystem shooterSubsystem;

    public StartSpinCommand(ShooterSubsystem shooterSubsystem) {
        this.shooterSubsystem = shooterSubsystem;
        addRequirements(shooterSubsystem);
    }

    public void initialize() {
        shooterSubsystem.shootFlywheel(ShooterConstants.SHOOT_1_SPEED);
    }

    public boolean isFinished() {
        return true;
    }
    
}
