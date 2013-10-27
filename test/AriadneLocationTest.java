/**
 * Unit tests for AriadneLocation class
 *
 * Copyright (C) 2012-2013 Dieter Adriaenssens
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 *
 * @package org.ruleant.ariadne
 * @author  Dieter Adriaenssens <ruleant@users.sourceforge.net>
 */
import static org.mockito.Mockito.mock;

import org.ruleant.ariadne.lib.AriadneLocation;

import android.location.Location;

import junit.framework.TestCase;

/**
 * Unit tests for AriadneLocation class.
 *
 * @author  Dieter Adriaenssens <ruleant@users.sourceforge.net>
 */
public class AriadneLocationTest extends TestCase {
    /**
     * Instance of the AriadneLocation class.
     */
    private AriadneLocation location;
    
    /**
     * Mock location.
     */
    private Location mockLocation;

    /**
     * Sets up the test fixture.
     * (Called before every test case method.)
     */
    protected final void setUp() {
        location = new AriadneLocation("test");
        
        // create mock location
        mockLocation = mock(Location.class);
    }

    /**
     * Tests uninitialised state.
     */
  /*  public final void testNoInit() {
        assertFalse(location.isNewer(mockLocation));
        assertFalse(location.isRecent());
    }*/
}
