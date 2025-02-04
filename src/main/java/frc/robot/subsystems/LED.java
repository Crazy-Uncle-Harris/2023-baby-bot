// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.subsystems;

import edu.wpi.first.wpilibj.util.Color;
import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.Constants;
import frc.robot.RobotContainer;
import frc.robot.trobot5013lib.led.BlinkingPattern;
import frc.robot.trobot5013lib.led.ChasePattern;
import frc.robot.trobot5013lib.led.RainbowPattern;
import frc.robot.trobot5013lib.led.SolidColorPattern;
import frc.robot.trobot5013lib.led.TrobotAddressableLED;
import frc.robot.trobot5013lib.led.TrobotAddressableLEDPattern;
import frc.robot.trobot5013lib.led.IntensityPattern;
import frc.robot.trobot5013lib.led.ChasePattern;

public class LED extends SubsystemBase {
	private TrobotAddressableLED m_led = new TrobotAddressableLED(Constants.LEDConstants.LED_PWM_PORT, 60);
	private RobotContainer m_RobotContainer;
	private TrobotAddressableLEDPattern m_bluePattern = new SolidColorPattern(Color.kBlue);
	private TrobotAddressableLEDPattern m_redPattern = new SolidColorPattern(Color.kRed);
	// private TrobotAddressableLEDPattern m_disabledPattern = new ChasePattern(new
	// Color[]{Color.kRed,Color.kWhite},3);
	private TrobotAddressableLEDPattern m_disabledPattern = new RainbowPattern();
	private TrobotAddressableLEDPattern m_greenPattern = new SolidColorPattern(Color.kGreen);
	private TrobotAddressableLEDPattern m_yellowPattern = new SolidColorPattern(Color.kLightYellow);
	private TrobotAddressableLEDPattern m_blinkingRed = new BlinkingPattern(Color.kRed, 0.25);
	private TrobotAddressableLEDPattern m_blinkingGreen = new BlinkingPattern(Color.kGreen, 0.25);
	private TrobotAddressableLEDPattern m_purplePattern = new SolidColorPattern(Color.kPurple);
	private IntensityPattern m_blueIntensityPattern = new IntensityPattern(Color.kBlue, 0);
	private IntensityPattern m_redIntensityPattern = new IntensityPattern(Color.kRed, 0);
	private int intensityDegrees = 10;
    private Color[] redWhiteArray = {Color.kRed, Color.kWhite};
    private Color[] blueWhiteArray = {Color.kBlue, Color.kWhite};
    private TrobotAddressableLEDPattern m_redChasePattern = new ChasePattern(redWhiteArray, 3);
    private TrobotAddressableLEDPattern m_blueChasePattern = new ChasePattern(blueWhiteArray, 3);
	/** Creates a new StatusLED. */
	public LED(RobotContainer robotContainer) {
		super();
		m_RobotContainer = robotContainer;
	}

	@Override
	public void periodic() {
		// This method will be called once per scheduler run
		
		// set patterns to run based on various statuses of the robot via the m_RobotContainer

		if (m_RobotContainer.isDisabled()) {
			m_led.setPattern(m_disabledPattern);
		} else if (m_RobotContainer.isRedAlliance()) {
			m_led.setPattern(m_redPattern);
		} else {
			m_led.setPattern(m_bluePattern);
		}

	}
}
