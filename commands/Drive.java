/*    */ package frc.robot.commands;
/*    */ 
/*    */ import edu.wpi.first.wpilibj2.command.Command;
/*    */ import edu.wpi.first.wpilibj2.command.Subsystem;
/*    */ import edu.wpi.first.wpilibj2.command.button.CommandXboxController;
/*    */ import frc.robot.subsystems.CANDriveSubsystem;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class Drive
/*    */   extends Command
/*    */ {
/*    */   CANDriveSubsystem driveSubsystem;
/*    */   CommandXboxController controller;
/*    */   
/*    */   public Drive(CANDriveSubsystem driveSystem, CommandXboxController driverController) {
/* 21 */     addRequirements(new Subsystem[] { (Subsystem)driveSystem });
/* 22 */     this.driveSubsystem = driveSystem;
/* 23 */     this.controller = driverController;
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public void initialize() {}
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public void execute() {
/* 38 */     this.driveSubsystem.driveArcade(-this.controller.getLeftY() * 0.7D, -this.controller.getRightX() * 0.8D);
/*    */   }
/*    */ 
/*    */ 
/*    */   
/*    */   public void end(boolean interrupted) {
/* 44 */     this.driveSubsystem.driveArcade(0.0D, 0.0D);
/*    */   }
/*    */ 
/*    */ 
/*    */   
/*    */   public boolean isFinished() {
/* 50 */     return false;
/*    */   }
/*    */ }


/* Location:              C:\Users\lettj\Downloads\2026KitBotClasses.jar!\frc\robot\commands\Drive.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */