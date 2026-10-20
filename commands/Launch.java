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
/*    */ public class Launch
/*    */   extends Command
/*    */ {
/*    */   CANFuelSubsystem fuelSubsystem;
/*    */   
/*    */   public Launch(CANFuelSubsystem fuelSystem) {
/* 19 */     addRequirements(new Subsystem[] { (Subsystem)fuelSystem });
/* 20 */     this.fuelSubsystem = fuelSystem;
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public void initialize() {
/* 27 */     this.fuelSubsystem
/* 28 */       .setIntakeLauncherRoller(
/* 29 */         SmartDashboard.getNumber("Launching launcher roller value", 11.6D));
/* 30 */     this.fuelSubsystem.setFeederRoller(SmartDashboard.getNumber("Launching feeder roller value", 10.0D));
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
/*    */   public void end(boolean interrupted) {}
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public boolean isFinished() {
/* 47 */     return false;
/*    */   }
/*    */ }


/* Location:              C:\Users\lettj\Downloads\2026KitBotClasses.jar!\frc\robot\commands\Launch.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */