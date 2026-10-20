/*    */ package frc.robot.commands;
/*    */ 
/*    */ import edu.wpi.first.wpilibj2.command.Command;
/*    */ import edu.wpi.first.wpilibj2.command.SequentialCommandGroup;
/*    */ import frc.robot.subsystems.CANFuelSubsystem;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class LaunchSequence
/*    */   extends SequentialCommandGroup
/*    */ {
/*    */   public LaunchSequence(CANFuelSubsystem fuelSubsystem) {
/* 16 */     super(new Command[0]);
/*    */ 
/*    */     
/* 19 */     addCommands(new Command[] { (Command)(new SpinUp(fuelSubsystem))
/* 20 */           .withTimeout(1.0D), new Launch(fuelSubsystem) });
/*    */   }
/*    */ }


/* Location:              C:\Users\lettj\Downloads\2026KitBotClasses.jar!\frc\robot\commands\LaunchSequence.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */