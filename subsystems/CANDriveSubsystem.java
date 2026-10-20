/*    */ package frc.robot.subsystems;
/*    */ 
/*    */ import com.ctre.phoenix6.configs.TalonFXConfiguration;
/*    */ import com.ctre.phoenix6.hardware.TalonFX;
/*    */ import com.ctre.phoenix6.signals.InvertedValue;
/*    */ import edu.wpi.first.wpilibj.drive.DifferentialDrive;
/*    */ import edu.wpi.first.wpilibj2.command.SubsystemBase;
/*    */ import java.util.Objects;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class CANDriveSubsystem
/*    */   extends SubsystemBase
/*    */ {
/*    */   private final TalonFX leftLeader;
/*    */   private final TalonFX leftFollower;
/*    */   private final TalonFX rightLeader;
/*    */   private final TalonFX rightFollower;
/*    */   private final DifferentialDrive drive;
/*    */   
/*    */   public CANDriveSubsystem() {
/* 30 */     this.leftLeader = new TalonFX(1);
/* 31 */     this.leftFollower = new TalonFX(2);
/* 32 */     this.rightLeader = new TalonFX(3);
/* 33 */     this.rightFollower = new TalonFX(4);
/*    */ 
/*    */     
/* 36 */     Objects.requireNonNull(this.leftLeader); Objects.requireNonNull(this.rightLeader); this.drive = new DifferentialDrive(this.leftLeader::set, this.rightLeader::set);
/*    */     
/* 38 */     TalonFXConfiguration leftConfig = new TalonFXConfiguration();
/* 39 */     leftConfig.MotorOutput.Inverted = InvertedValue.CounterClockwise_Positive;
/* 40 */     this.leftLeader.getConfigurator().apply(leftConfig);
/* 41 */     this.leftFollower.getConfigurator().apply(leftConfig);
/*    */     
/* 43 */     TalonFXConfiguration rightConfig = new TalonFXConfiguration();
/* 44 */     rightConfig.MotorOutput.Inverted = InvertedValue.Clockwise_Positive;
/* 45 */     this.rightLeader.getConfigurator().apply(rightConfig);
/* 46 */     this.rightFollower.getConfigurator().apply(rightConfig);
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public void periodic() {}
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public void driveArcade(double xSpeed, double zRotation) {
/* 87 */     this.drive.arcadeDrive(xSpeed, zRotation);
/*    */   }
/*    */ }


/* Location:              C:\Users\lettj\Downloads\2026KitBotClasses.jar!\frc\robot\subsystems\CANDriveSubsystem.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */