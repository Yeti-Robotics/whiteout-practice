// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot;

/**
 * The Constants class provides a convenient place for teams to hold robot-wide numerical or boolean
 * constants. This class should not be used for any other purpose. All constants should be declared
 * globally (i.e. public static). Do not put anything functional in this class.
 *
 * <p>It is advised to statically import this class (or one of its inner classes) wherever the
 * constants are needed, to reduce verbosity.
 */
public final class Constants {


    public static final double HOOD_SPEED = 0.1;
    public static final double HOOD_GEAR_RATIO = 340.0;
    public static final double COUNTS_PER_DEGREE = (HOOD_GEAR_RATIO) / 360.0;
    public static final double HOOD_ANGLE_TOLERANCE = 0.5;
    public static final double MAX_HOOD_ANGLE = 40.0;

    

    public final static int LEFT_CLIMBER_FALCON = 0; //placeholder
    public final static int RIGHT_CLIMBER_FALCON = 1;//placeholder
    public final static int[] BRAKE_CLIMBER_SOLENOID = {3, 4};//placeholder
    public final static double CLIMBER_SPEED = 23.0;
    public final static int CLIMBER_TOLERANCE = 5;



    public static final int SHOOTER_LEFT_MOTOR = 9; //left
    public static final int SHOOTER_RIGHT_MOTOR = 10; //right  
    public static final double SHOOT_1_SPEED = .9;
    public static final double SHOOT_2_SPEED = .9;
    public static final double REVERSE_SHOOT_1_SPEED = -0.5;
    public static final double REVERSE_SHOOT_2_SPEED = -0.5;
    public static final double PULLEY_RATIO = 12.0 / 48.0;
    public static final double ENCODER_TIME_CONVERSION = 600.0; // 100 ms per minute
    public static final double ENCODER_RESOLUTION = 12.0;
    public static final double QUAD_FACTOR = 4.0; // quadrature encoder factor
    public static final double MAX_RPM = 1425.0;
    

}


