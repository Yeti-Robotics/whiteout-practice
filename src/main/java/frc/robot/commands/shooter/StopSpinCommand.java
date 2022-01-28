package frc.robot.commands.shooter;

import edu.wpi.first.wpilibj.AddressableLED;
import edu.wpi.first.wpilibj2.command.CommandBase;
import frc.robot.Constants.ShooterConstants;
import frc.robot.subsystems.ShooterSubsystem;

public class StopSpinCommand extends CommandBase {

    private final ShooterSubsystem shooterSubsystem;

    public StopSpinCommand(ShooterSubsystem shooterSubsystem) {
        this.shooterSubsystem = shooterSubsystem;
        addRequirements(shooterSubsystem);
    }

    public void end() {
        shooterSubsystem.shootFlywheel(0);
    }

    public boolean isFinished() {
        return true;
    }
    
}
