/*
 * This file is part of the Raster Storage Archive (RSA).
 *
 * The RSA is free software: you can redistribute it and/or modify it under the
 * terms of the GNU General Public License as published by the Free Software
 * Foundation, either version 3 of the License, or (at your option) any later
 * version.
 *
 * The RSA is distributed in the hope that it will be useful, but WITHOUT ANY
 * WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS FOR
 * A PARTICULAR PURPOSE.  See the GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License along with
 * the RSA.  If not, see <http://www.gnu.org/licenses/>.
 *
 * Copyright 2013 CRCSI - Cooperative Research Centre for Spatial Information
 * http://www.crcsi.com.au/
 */

package org.vpac.ndg.cli.smadaptor;

import java.util.List;

import org.vpac.ndg.exceptions.TaskException;
import org.vpac.ndg.exceptions.TaskInitialisationException;
import org.vpac.ndg.storagemanager.HasDescription;

public interface DataImport extends HasDescription {

	public void setRemainingArgs(List<String> remainingArgs);

	public void setUploadId(String uploadId);

	public String start() throws TaskInitialisationException, TaskException;

	public void setBand(String bandId);

	public void setSrcnodata(String srcnodata);

	/**
	 * @param value Whether to use bilinear interpolation. If null, the decision
	 *        will be made based on the domain type of the band.
	 */
	public void setUseBilinearInterpolation(Boolean value);

}
