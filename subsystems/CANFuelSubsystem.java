/*    */ package frc.robot.subsystems;
/*    */ 
/*    */ import com.revrobotics.spark.SparkBase;
/*    */ import com.revrobotics.spark.SparkLowLevel;
/*    */ import com.revrobotics.spark.SparkMax;
/*    */ import com.revrobotics.spark.config.SparkBaseConfig;
/*    */ import com.revrobotics.spark.config.SparkMaxConfig;
/*    */ import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;
/*    */ import edu.wpi.first.wpilibj2.command.SubsystemBase;
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
/*    */ public class CANFuelSubsystem
/*    */   extends SubsystemBase
/*    */ {
/* 24 */   private final SparkMax intakeLauncherRoller = new SparkMax(5, SparkLowLevel.MotorType.kBrushed);
/* 25 */   private final SparkMax feederRoller = new SparkMax(6, SparkLowLevel.MotorType.kBrushed);
/*    */ 
/*    */   
/*    */   public CANFuelSubsystem() {
/* 29 */     SparkMaxConfig feederConfig = new SparkMaxConfig();
/* 30 */     feederConfig.smartCurrentLimit(60);
/* 31 */     this.feederRoller.configure((SparkBaseConfig)feederConfig, SparkBase.ResetMode.kResetSafeParameters, SparkBase.PersistMode.kPersistParameters);
/*    */ 
/*    */ 
/*    */ 
/*    */     
/* 36 */     SparkMaxConfig launcherConfig = new SparkMaxConfig();
/* 37 */     launcherConfig.inverted(true);
/* 38 */     launcherConfig.smartCurrentLimit(60);
/* 39 */     this.intakeLauncherRoller.configure((SparkBaseConfig)launcherConfig, SparkBase.ResetMode.kResetSafeParameters, SparkBase.PersistMode.kPersistParameters);
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */     
/* 45 */     SmartDashboard.putNumber("Intaking feeder roller value", -12.0D);
/* 46 */     SmartDashboard.putNumber("Intaking intake roller value", 10.0D);
/* 47 */     SmartDashboard.putNumber("Launching feeder roller value", 10.0D);
/* 48 */     SmartDashboard.putNumber("Launching launcher roller value", 11.6D);
/* 49 */     SmartDashboard.putNumber("Spin-up feeder roller value", 6.0D);
/*    */   }
/*    */ 
/*    */   
/*    */   public void setIntakeLauncherRoller(double voltage) {
/* 54 */     this.intakeLauncherRoller.setVoltage(voltage);
/*    */   }
/*    */ 
/*    */   
/*    */   public void setFeederRoller(double voltage) {
/* 59 */     this.feederRoller.setVoltage(voltage);
/*    */   }
/*    */ 
/*    */   
/*    */   public void stop() {
/* 64 */     this.feederRoller.set(0.0D);
/* 65 */     this.intakeLauncherRoller.set(0.0D);
/*    */   }
/*    */   
/*    */   public void periodic() {}
/*    */ }


/* Location:              C:\Users\lettj\Downloads\2026KitBotClasses.jar!\frc\robot\subsystems\CANFuelSubsystem.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */