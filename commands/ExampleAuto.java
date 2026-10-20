/*    */ package frc.robot.commands;
/*    */ 
/*    */ import edu.wpi.first.wpilibj2.command.Command;
/*    */ import edu.wpi.first.wpilibj2.command.SequentialCommandGroup;
/*    */ import frc.robot.subsystems.CANDriveSubsystem;
/*    */ import frc.robot.subsystems.CANFuelSubsystem;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class ExampleAuto
/*    */   extends SequentialCommandGroup
/*    */ {
/*    */   public ExampleAuto(CANDriveSubsystem driveSubsystem, CANFuelSubsystem ballSubsystem) {
/* 16 */     super(new Command[0]);
/*    */ 
/*    */     
/* 19 */     addCommands(new Command[] { (Command)(new AutoDrive(driveSubsystem, 0.5D, 0.0D))
/*    */ 
/*    */ 
/*    */           
/* 23 */           .withTimeout(0.5D), (Command)(new Launch(ballSubsystem))
/*    */ 
/*    */           
/* 26 */           .withTimeout(10.0D) });
/*    */   }
/*    */ }


/* Location:              C:\Users\lettj\Downloads\2026KitBotClasses.jar!\frc\robot\commands\ExampleAuto.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */