
/* Soot - a J*va Optimization Framework
 * Copyright (C) 2003 Ondrej Lhotak
 *
 * This library is free software; you can redistribute it and/or
 * modify it under the terms of the GNU Lesser General Public
 * License as published by the Free Software Foundation; either
 * version 2.1 of the License, or (at your option) any later version.
 *
 * This library is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU
 * Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public
 * License along with this library; if not, write to the
 * Free Software Foundation, Inc., 59 Temple Place - Suite 330,
 * Boston, MA 02111-1307, USA.
 */

/* THIS FILE IS AUTO-GENERATED FROM soot_options.xml. DO NOT MODIFY. */

package soot.options;
import java.util.*;

/** Option parser for Static Method Binding. */
public class SMBOptions
{
    private Map options;

    public SMBOptions( Map options ) {
        this.options = options;
    }
    
    /** Enabled --
    
     * .
    
     * 
     */
    public boolean enabled() {
        return soot.PhaseOptions.getBoolean( options, "enabled" );
    }
    
    /** Insert Null Checks --
    
     * .
    
     * The receiver object is checked for nullness before the target 
     * method is invoked. If the target is null, then a NullPointer 
     * exception is thrown. 
     */
    public boolean insert_null_checks() {
        return soot.PhaseOptions.getBoolean( options, "insert-null-checks" );
    }
    
    /** Insert Redundant Casts --
    
     * .
    
     * Inserts extra casts for the verifier. The verifier will 
     * complain if the target uses `this' (so we have to pass an extra 
     * parameter), and the argument passed to the method is not the 
     * same type. For instance, Bottle.pricestatic is a method which 
     * takes a Cost object, and Cost is an interface implemented by 
     * Bottle. We must then cast the Cost to a Bottle before passing 
     * it to pricestatic. 
     */
    public boolean insert_redundant_casts() {
        return soot.PhaseOptions.getBoolean( options, "insert-redundant-casts" );
    }
    
    public static final int allowed_modifier_changes_unsafe = 1;
    public static final int allowed_modifier_changes_safe = 2;
    public static final int allowed_modifier_changes_none = 3;
    /** Allow Modifier Changes --
    
     * .
    
     * Determines what changes in visibility modifiers are allowed. 
     * ``unsafe'' modifies the visibility on code so that all inlining 
     * is permitted; some IllegalAccessErrors may be missed. ``safe'' 
     * preserves the exact meaning of the analysed program, and 
     * ``none'' changes no modifiers whatsoever. 
     * 
     */
    public int allowed_modifier_changes() {
        String s = soot.PhaseOptions.getString( options, "allowed-modifier-changes" );
        
        if( s.equalsIgnoreCase( "unsafe" ) )
            return allowed_modifier_changes_unsafe;
        
        if( s.equalsIgnoreCase( "safe" ) )
            return allowed_modifier_changes_safe;
        
        if( s.equalsIgnoreCase( "none" ) )
            return allowed_modifier_changes_none;
        
        throw new RuntimeException( "Invalid value "+s+" of phase option allowed-modifier-changes" );
    }
    
}
        