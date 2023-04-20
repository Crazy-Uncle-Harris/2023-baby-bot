// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot;

/**
 * The Constants class provides a convenient place for teams to hold robot-wide
 * numerical or boolean
 * constants. This class should not be used for any other purpose. All constants
 * should be declared
 * globally (i.e. public static). Do not put anything functional in this class.
 *
 * <p>
 * It is advised to statically import this class (or one of its inner classes)
 * wherever the
 * constants are needed, to reduce verbosity.
 */
public final class Constants {
  public static class OperatorConstants {
    public static final int kDriverControllerPort = 0;
  }

  public static class DriveBaseConstants {
    public static final int leftBackTalonFX_ID = 41;
    public static final int leftFrontTalonFX_ID = 42;
    public static final int rightBackTalonFX_ID = 21;
    public static final int rightFrontTalonFX_ID = 24;

    public static final double rotationGoverner = 1.0;
    public static final double speedGoverner = 1.0;
  }

  public static class SnatchAndSpitConstants {
    public static final int upperSparkMaxID = 6;
    public static final int lowerSparkMaxID = 9;

    public static final class UpperPIDConstants {
      public static final double kP = 0;
      public static final double kI = 0;
      public static final double kD = 0;
      public static final double kIz = 0;
      public static final double kFF = 0.0;
      public static final double kMaxOutput = 1;
      public static final double kMinOutput = -1;
      public static final double maxRPM = 5700;
      public static final double maxVel = 2000;
      public static final double minVel = 0;
      public static final double maxAcc = 1500;
      public static final int smartMotionSlot = 0;
      public static final double allowedError = 0;
    }

    public static final class LowerPIDConstants {
      public static final double kP = 0;
      public static final double kI = 0;
      public static final double kD = 0;
      public static final double kIz = 0;
      public static final double kFF = 0.0;
      public static final double kMaxOutput = 1;
      public static final double kMinOutput = -1;
      public static final double maxRPM = 5700;
      public static final double maxVel = 2000;
      public static final double minVel = 0;
      public static final double maxAcc = 1500;
      public static final int smartMotionSlot = 0;
      public static final double allowedError = 0;
    }
  }
}