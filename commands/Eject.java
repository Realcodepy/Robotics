/*    */ package frc.robot.commands;
/*    */ 
/*    */ import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;
/*    */ import edu.wpi.first.wpilibj2.command.Command;
/*    */ import edu.wpi.first.wpilibj2.command.Subsystem;
/*    */ import frc.robot.subsystems.CANFuelSubsystem;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class Eject
/*    */   extends Command
/*    */ {
/*    */   CANFuelSubsystem fuelSubsystem;
/*    */   
/*    */   public Eject(CANFuelSubsystem fuelSystem) {
/* 19 */     addRequirements(new Subsystem[] { (Subsystem)fuelSystem });
/* 20 */     this.fuelSubsystem = fuelSystem;
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public void initialize() {
/* 27 */     this.fuelSubsystem
/* 28 */       .setIntakeLauncherRoller(-1.0D * 
/* 29 */         SmartDashboard.getNumber("Intaking intake roller value", 10.0D));
/* 30 */     this.fuelSubsystem
/* 31 */       .setFeederRoller(-1.0D * SmartDashboard.getNumber("Intaking feeder roller value", -12.0D));
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public void execute() {}
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public void end(boolean interrupted) {
/* 43 */     this.fuelSubsystem.setIntakeLauncherRoller(0.0D);
/* 44 */     this.fuelSubsystem.setFeederRoller(0.0D);
/*    */   }
/*    */ 
/*    */ 
/*    */   
/*    */   public boolean isFinished() {
/* 50 */     return false;
/*    */   }
/*    */ }


/* Location:              C:\Users\lettj\Downloads\2026KitBotClasses.jar!\frc\robot\commands\Eject.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */