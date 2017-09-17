/*
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.apache.distributedlog.stream.storage.exceptions;

/**
 * Storage related runtime exception.
 */
public class StorageRuntimeException extends RuntimeException {

  private static final long serialVersionUID = -3905780641131702910L;

  public StorageRuntimeException(String msg) {
    super(msg);
  }

  public StorageRuntimeException(String msg, Throwable cause) {
    super(msg, cause);
  }

  public StorageRuntimeException(Throwable cause) {
    super(cause);
  }

}
