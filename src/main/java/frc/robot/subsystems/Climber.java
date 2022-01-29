package frc.robot.subsystems;
import edu.wpi.first.wpilibj.DoubleSolenoid;
import edu.wpi.first.wpilibj.PneumaticsModuleType;
import edu.wpi.first.wpilibj.DoubleSolenoid.*;
import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.Constants;

import com.ctre.phoenix.motorcontrol.ControlMode;
import com.ctre.phoenix.motorcontrol.FeedbackDevice;
import com.ctre.phoenix.motorcontrol.NeutralMode;
import com.ctre.phoenix.motorcontrol.ControlMode.*;
import com.ctre.phoenix.motorcontrol.can.WPI_TalonFX;
public class Climber extends SubsystemBase{
    private WPI_TalonFX leftClimberFalcon;
    private WPI_TalonFX rightClimberFalcon; 
    private DoubleSolenoid brakeClimber;
    private PneumaticsModuleType why;
    
    public Climber() {
        leftClimberFalcon = new WPI_TalonFX(Constants.LEFT_CLIMBER_FALCON);
        rightClimberFalcon = new WPI_TalonFX(Constants.RIGHT_CLIMBER_FALCON);
        brakeClimber = new DoubleSolenoid(2,why, 3, 4 );
            //Constants.BRAKE_CLIMBER_SOLENOID[0], Constants.BRAKE_CLIMBER_SOLENOID[1]
        leftClimberFalcon.setInverted(true);
        rightClimberFalcon.setInverted(true);
        brakeClimber.set(Value.kReverse); 
        leftClimberFalcon.follow(rightClimberFalcon);
        leftClimberFalcon.configSelectedFeedbackSensor(FeedbackDevice.IntegratedSensor);
        rightClimberFalcon.configSelectedFeedbackSensor(FeedbackDevice.IntegratedSensor);
        leftClimberFalcon.setNeutralMode(NeutralMode.Brake);
        rightClimberFalcon.setNeutralMode(NeutralMode.Brake);
    }
    @Override
    public void periodic() {
        // System.out.println("climber encoder: " + getAverageEncoder());
        // System.out.println("solenoid: " + climberBrake.get());
    }

    public void climbUp(){
        rightClimberFalcon.set(ControlMode.PercentOutput, Constants.CLIMBER_SPEED);
    }

    public void climbDown(){
        rightClimberFalcon.set(ControlMode.PercentOutput, -Constants.CLIMBER_SPEED);
    }

    public void stopClimb(){
        rightClimberFalcon.set(ControlMode.PercentOutput, 0.0);
    }

    public double getLeftEncoder(){
        return rightClimberFalcon.getSelectedSensorPosition(); 
    }

    public double getRightEncoder(){
        return rightClimberFalcon.getSelectedSensorPosition();
    }

    public double getAverageEncoder(){
        return (getLeftEncoder() + getRightEncoder()) / 2.0;
    }

    public void resetEncoders(){
        leftClimberFalcon.setSelectedSensorPosition(0);
        rightClimberFalcon.setSelectedSensorPosition(0);
    }

    public void toggleBrake(){
        brakeClimber.toggle();
    }

    public DoubleSolenoid.Value getSolenoidPos(){
        return brakeClimber.get();
    }

    
}
