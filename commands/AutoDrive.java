/*    */ package frc.robot.commands;
/*    */ 
/*    */ import edu.wpi.first.wpilibj2.command.Command;
/*    */ import edu.wpi.first.wpilibj2.command.Subsystem;
/*    */ import frc.robot.subsystems.CANDriveSubsystem;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class AutoDrive
/*    */   extends Command
/*    */ {
/*    */   CANDriveSubsystem driveSubsystem;
/*    */   double xSpeed;
/*    */   double zRotation;
/*    */   
/*    */   public AutoDrive(CANDriveSubsystem driveSystem, double xSpeed, double zRotation) {
/* 19 */     addRequirements(new Subsystem[] { (Subsystem)driveSystem });
/* 20 */     this.driveSubsystem = driveSystem;
/* 21 */     this.xSpeed = xSpeed;
/* 22 */     this.zRotation = zRotation;
/*    */   }
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
/* 36 */     this.driveSubsystem.driveArcade(this.xSpeed, this.zRotation);
/*    */   }
/*    */ 
/*    */ 
/*    */   
/*    */   public void end(boolean interrupted) {
/* 42 */     this.driveSubsystem.driveArcade(0.0D, 0.0D);
/*    */   }
/*    */ 
/*    */ 
/*    */   
/*    */   public boolean isFinished() {
/* 48 */     return false;
/*    */   }
/*    */ }


/* Location:              C:\Users\lettj\Downloads\2026KitBotClasses.jar!\frc\robot\commands\AutoDrive.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */