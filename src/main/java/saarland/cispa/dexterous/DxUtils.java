/**
 * The ARTist Project (https://artist.cispa.saarland)
 *
 * Copyright (C) 2017 CISPA (https://cispa.saarland), Saarland University
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 *
 * @author "Sebastian Weisgerber <weisgerber@cispa.saarland>"
 *
 */
package saarland.cispa.dexterous;

import comm.android.dex.ClassDef;
import comm.android.dex.Dex;

import java.io.IOException;
import java.util.zip.ZipInputStream;
import java.util.zip.ZipOutputStream;


public class DxUtils {

    private static void closeIoStream(final ZipInputStream zipInput) {
        if (zipInput != null) try {
            zipInput.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void closeIoStream(final ZipOutputStream zipOutput) {
        if (zipOutput != null) try {
            zipOutput.flush();
            zipOutput.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static String getClassName(final Dex dexi, final ClassDef clazzDef) {
        return dexi.typeNames().get(clazzDef.getTypeIndex());
    }

}
